package dev.rama27.onlinebookstore.book;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BookServiceImpl {
     Book addBook(Book book) throws BookAlreadyExist;

     void addBooks(List<Book> books)  throws BookAlreadyExist;
     int noOfBooks();
     Optional<Book> getBook(UUID id) ;
     Page<Book> getAllBooks(Pageable pageable) ;
     Page<Book> getBooksByAuthor(String author,Pageable pageable) ;
     Page<Book> getBooksByTitle(String title,Pageable pageable) ;
     Page<Book> getBooksByTitleContaining(String title, Pageable pageable);
     Page<Book> getBooksByAuthorAndGenre(String author, String genre, Pageable pageable);

     Page<Book> getBooksByGenre(String genre, Pageable pageable);

     void deleteAll();
        
}
