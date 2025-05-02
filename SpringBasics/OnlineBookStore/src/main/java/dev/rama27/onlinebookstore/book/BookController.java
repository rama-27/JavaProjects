package dev.rama27.onlinebookstore.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("/books/add")
    public void addBook(@RequestBody Book book) throws BookAlreadyExist {
        bookService.addBook(book);
    }

    




}
