package dev.rama27.onlinebookstore.book;

import java.util.List;
import java.util.Optional;

public interface BookServiceImpl {
     void addBook(Book book) throws BookAlreadyExist;
     Optional<Book> getBook(long id) ;
     List<Book> getAllBooks() ;
     Optional<Object> getBooksByAuthor(String author) ;
     List<Book> getBooksByCategory(long categoryId) ;
     List<Book> getBooksByTitle(String title) ;
     List<Book> getBooksByAuthorAndCategory(String author, long categoryId) ;
        
        
}
