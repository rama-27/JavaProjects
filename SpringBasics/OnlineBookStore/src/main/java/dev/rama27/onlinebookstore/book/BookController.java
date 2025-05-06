package dev.rama27.onlinebookstore.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "/api/v1/")
public class BookController {
    private BookService bookService;
    @Autowired
    public BookController (BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/books/{bookname}")
    public Book getBookByName(@PathVariable String bookname){
        List<Book> books=bookService.getBooksByTitle(bookname);
        return books.get(0);
    }
    @GetMapping("/books/count")
    public int getCountBooks(){
        return bookService.noOfBooks();
    }
    @PostMapping("/books/add")
    public void addBook(@RequestBody Book book) throws BookAlreadyExist {
        bookService.addBook(book);
    }

    @PostMapping("/books/adds")
    public void addBooks(@RequestBody List<Book> books) throws BookAlreadyExist{
        bookService.addBooks(books);
    }

    @DeleteMapping("/books")
    public void deleteAll(){
        bookService.deleteAll();
    }
    




}
