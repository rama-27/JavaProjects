package dev.rama27.onlinebookstore.Loader;

import dev.rama27.onlinebookstore.book.Book;
import dev.rama27.onlinebookstore.book.BookRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Component
public class BookDataLoader implements ApplicationRunner {

    private final BookRepo bookRepository;
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
    private final Random random = new Random();

    @Autowired
    public BookDataLoader(BookRepo bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    @Transactional
    public void run(ApplicationArguments args) {
        if (bookRepository.count() > 0) {
            System.out.println("Database already populated. Skipping data import.");
            return;
        }

        try {
            loadBooksFromCsv();
        } catch (Exception e) {
            System.err.println("Error loading book data: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void loadBooksFromCsv() throws Exception {
        Resource resource = new ClassPathResource("books.csv");

        // Use a more robust CSV parser configuration
        try (Reader reader = new InputStreamReader(resource.getInputStream());
             CSVReader csvReader = new CSVReaderBuilder(reader)
                     .withCSVParser(new CSVParserBuilder()
                             .withSeparator(';')             // <<< CHANGED: Use semicolon
                             .withQuoteChar('"')             // Standard, usually correct.
                             .withEscapeChar('\\')           // Keep this if your problematic titles have \\\" sequences.
                             .withStrictQuotes(false)        // Correct, as your fields are not always quoted.
                             .withIgnoreLeadingWhiteSpace(true) // Good for cleaning up spaces.
                             .build())
                     .build()) {

            // Read header row
            String[] header = csvReader.readNext();
            if (header == null) {
                throw new RuntimeException("CSV file is empty or could not be read");
            }

            // Map column indices
            int isbnIndex = findColumnIndex(header, "ISBN");
            int titleIndex = findColumnIndex(header, "Book-Title");
            int authorIndex = findColumnIndex(header, "Book-Author");
            int yearIndex = findColumnIndex(header, "Year-Of-Publication");
            int publisherIndex = findColumnIndex(header, "Publisher");
            int imageUrlSIndex = findColumnIndex(header, "Image-URL-S");
            int imageUrlMIndex = findColumnIndex(header, "Image-URL-M");
            int imageUrlLIndex = findColumnIndex(header, "Image-URL-L");
            int genreIndex = findColumnIndex(header, "genre");
            int descriptionIndex = findColumnIndex(header, "description");

            List<Book> books = new ArrayList<>();
            String[] line;
            int count = 0;
            int skippedCount = 0;
            int batchSize = 500;

            while ((line = csvReader.readNext()) != null) {
                try {
                    Book book = new Book();

                    // Required fields
                    if (titleIndex >= 0 && titleIndex < line.length) {
                        if (line[titleIndex] != null && !line[titleIndex].isEmpty()) {
                            book.setTitle(truncateIfNeeded(line[titleIndex], 255));
                        } else {
                            skippedCount++;
                            continue; // Skip this record if title is missing
                        }
                    } else {
                        skippedCount++;
                        continue; // Skip this record if title is missing
                    }

                    // Optional fields with null checks
                    if (isbnIndex >= 0 && isbnIndex < line.length) {
                        book.setIsbn(truncateIfNeeded(line[isbnIndex], 20));
                    }

                    if (authorIndex >= 0 && authorIndex < line.length) {
                        book.setAuthor(truncateIfNeeded(line[authorIndex], 255));
                    }

                    if (yearIndex >= 0 && yearIndex < line.length) {
                        try {
                            String yearStr = line[yearIndex];
                            if (yearStr != null && !yearStr.isEmpty() && yearStr.matches("\\d+")) {
                                Date publicationDate = dateFormat.parse(yearStr);
                                book.setPublicationDate(publicationDate);
                            }
                        } catch (ParseException e) {
                            // Handle invalid date format silently
                        }
                    }

                    if (publisherIndex >= 0 && publisherIndex < line.length) {
                        book.setPublisher(truncateIfNeeded(line[publisherIndex], 255));
                    }

                    if (imageUrlLIndex >= 0 && imageUrlLIndex < line.length && !line[imageUrlLIndex].isEmpty()) {
                        book.setImageUrl(truncateIfNeeded(line[imageUrlLIndex], 255));
                    } else if (imageUrlMIndex >= 0 && imageUrlMIndex < line.length && !line[imageUrlMIndex].isEmpty()) {
                        book.setImageUrl(truncateIfNeeded(line[imageUrlMIndex], 255));
                    } else if (imageUrlSIndex >= 0 && imageUrlSIndex < line.length && !line[imageUrlSIndex].isEmpty()) {
                        book.setImageUrl(truncateIfNeeded(line[imageUrlSIndex], 255));
                    }

                    if (genreIndex >= 0 && genreIndex < line.length) {
                        book.setGenre(truncateIfNeeded(line[genreIndex], 50));
                    }

                    if (descriptionIndex >= 0 && descriptionIndex < line.length) {
                        book.setDescription(truncateIfNeeded(line[descriptionIndex], 2000));
                    }

                    BigDecimal price = new BigDecimal(5.99 + (random.nextDouble() * 24.00));
                    // Round to 2 decimal places
                    price = price.setScale(2, BigDecimal.ROUND_HALF_UP);
                    book.setPrice(price);

                    books.add(book);
                    count++;

                    // Process in batches to avoid memory issues
                    if (count % batchSize == 0) {
                        bookRepository.saveAll(books);
                        books.clear();
                        System.out.println("Imported " + count + " books so far");
                    }
                } catch (Exception e) {
                    System.err.println("Error processing CSV line: " + e.getMessage());
                    skippedCount++;
                }
            }

            // Save any remaining books
            if (!books.isEmpty()) {
                bookRepository.saveAll(books);
            }

            System.out.println("Finished importing " + count + " books. Skipped " + skippedCount + " books due to errors.");

        } catch (CsvValidationException e) {
            throw new RuntimeException("Error validating CSV: " + e.getMessage(), e);
        }
    }

    /**
     * Truncates the input string if it exceeds the maximum length.
     *
     * @param input The input string
     * @param maxLength The maximum length allowed
     * @return The truncated string
     */
    private String truncateIfNeeded(String input, int maxLength) {
        if (input == null) {
            return null;
        }
        return input.length() <= maxLength ? input : input.substring(0, maxLength);
    }

    private int findColumnIndex(String[] header, String columnName) {
        for (int i = 0; i < header.length; i++) {
            if (header[i].trim().equalsIgnoreCase(columnName)) {
                return i;
            }
        }
        return -1; // Column not found
    }
}