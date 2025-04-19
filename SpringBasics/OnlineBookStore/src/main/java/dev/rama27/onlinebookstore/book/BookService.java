package dev.rama27.onlinebookstore.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    BookRepo repo;
    @Autowired
    public BookService(BookRepo repo) {
        this.repo = repo;
    }
    public void addBook(Book book)   {
        Book existingBook = repo.findById(book.getId()).orElse(null);
        if(existingBook==null){
            repo.save(book);
        }
        else{
            try {
                throw new BookAlreadyExist("Book with ID " + book.getId() + " already exists.");
            } catch (BookAlreadyExist e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Book getBook(long id) {
        Book book = repo.findById(id).orElse(null);
        if (book != null) {
            return book;
        } else {
            return null;
        }
    }

    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    public List<Book> getBooksByAuthor(String author) {
        return repo.findAllByAuthor(author);
    }
    
}
