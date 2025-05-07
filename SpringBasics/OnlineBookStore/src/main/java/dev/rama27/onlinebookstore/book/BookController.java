package dev.rama27.onlinebookstore.book;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController(value = "/api/v1/")
public class BookController {
    private BookService bookService;

    @Autowired
    public BookController (BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public ResponseEntity<Page<Book>> getAllBooksWithDefaultSort(
            @PageableDefault(sort = "title", direction = Sort.Direction.ASC) Pageable pageable) {

        return ResponseEntity.ok(bookService.getAllBooks(pageable));

    }

    @GetMapping("/books/{title}/")
    public ResponseEntity<Page<Book>> getBooksByTitle(@PathVariable String title,
                                         @PageableDefault
                                                 (sort="title",direction = Sort.Direction.ASC)
                                         Pageable pageable ){
        Page<Book> books= bookService.getBooksByTitleContaining(title,pageable);
        return ResponseEntity.ok(books);
    }

    @GetMapping("/books/author/{author}")
    public ResponseEntity<Page<Book>> getBooksFromAuthor(@PathVariable String author,
                                                         @PageableDefault
                                                                 (sort="title",direction = Sort.Direction.ASC)
                                                         Pageable pageable){
        Page<Book> books=bookService.getBooksByAuthor(author,pageable);
        return ResponseEntity.ok(books);
    }

    @GetMapping("/books/author/{author}/genre/{genre}")
    public ResponseEntity<Page<Book>> getBoooksByAuthorAndGenre(@PathVariable String author,
                                                                @PathVariable String genre,
                                                                @PageableDefault
                                                                            (sort="title",direction = Sort.Direction.ASC )
                                                                Pageable pageable){
        Page<Book> books=bookService.getBooksByAuthorAndGenre(author,genre,pageable);
        return ResponseEntity.ok(books);
    }


    @GetMapping("/books/count")
    public ResponseEntity<Integer> getCountBooks(){
        return ResponseEntity.ok(bookService.noOfBooks());
    }


    @PostMapping("/books/add")
    public  ResponseEntity<Book> addBook(@RequestBody Book book) throws BookAlreadyExist {
        Book saved=bookService.addBook(book);
        URI location= ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{id}")
                .buildAndExpand(saved.getId())
                .toUri();
        return ResponseEntity.created(location).body(book);
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
