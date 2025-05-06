package dev.rama27.onlinebookstore.book;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BookServiceImpl {
     void addBook(Book book) throws BookAlreadyExist;

     void addBooks(List<Book> books)  throws BookAlreadyExist;
     int noOfBooks();
     Optional<Book> getBook(UUID id) ;
     List<Book> getAllBooks() ;
     Optional<Object> getBooksByAuthor(String author) ;
     List<Book> getBooksByTitle(String title) ;
     List<Book> getBooksByAuthorAndGenre(String author, String genre);

     List<Book> getBooksByGenre(String genre);

     void deleteAll();
        
}
