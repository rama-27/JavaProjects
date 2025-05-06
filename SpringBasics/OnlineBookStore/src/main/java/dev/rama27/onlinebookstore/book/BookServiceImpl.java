package dev.rama27.onlinebookstore.book;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BookServiceImpl {
     void addBook(Book book) throws BookAlreadyExist;

     void addBooks(List<Book> books)  throws BookAlreadyExist;
     int noOfBooks();
     Optional<Book> getBook(UUID id) ;
     Page<Book> getAllBooks(Pageable pageable) ;
     Optional<Object> getBooksByAuthor(String author) ;
     List<Book> getBooksByTitle(String title) ;
     Page<Book> getBooksByTitleContaining(String title, Pageable pageable);
     List<Book> getBooksByAuthorAndGenre(String author, String genre);

     List<Book> getBooksByGenre(String genre);

     void deleteAll();
        
}
