package dev.rama27.onlinebookstore.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BookService implements BookServiceImpl{
    BookRepo repo;
    @Autowired
    public BookService(BookRepo repo) {
        this.repo = repo;
    }

    @Override
    public Book addBook(Book book) throws BookAlreadyExist {
        if (repo.existsByIsbn(book.getIsbn())) {
            throw new BookAlreadyExist("Book with id " + book.getId() + " already exists");
        }
        Book books=repo.save(book);
        return books;
    }

    @Override
    public void addBooks(List<Book> books) throws BookAlreadyExist {
        for(Book book :books){
            addBook(book);
        }

    }

    @Override
    public int noOfBooks() {
        return (int)repo.count();
    }

    @Override
    public Optional<Book> getBook(UUID id) {
        if (repo.existsById(id)) {
            return repo.findById(id);
        }
        return Optional.empty();
    }

    @Override
    public Page<Book> getAllBooks(Pageable pageable) {
        return repo.findAll(pageable);
    }

    @Override
    public Page<Book> getBooksByAuthor(String author,Pageable pageable) {
        return null;
    }


    @Override
    public Page<Book> getBooksByTitle(String title,Pageable pageable) {
            return repo.findByTitleContaining(title,pageable);
    }

    @Override
    public Page<Book> getBooksByTitleContaining(String title,Pageable pageable) {
        Page<Book> Books=repo.findBooksByTitleContainingIgnoreCase(title,  pageable);
        return Books;
    }

    @Override
    public Page<Book> getBooksByAuthorAndGenre(String author, String genre,Pageable pageable) {
        Page<Book> res=repo.findByAuthorContainingIgnoreCaseAndGenreContainingIgnoreCase(author,genre,pageable);
        return res;
    }


    @Override
    public Page<Book> getBooksByGenre(String genre,Pageable pageable) {
        Page<Book> res=repo.findByGenre(genre,pageable);
        return res;
    }


    @Override
    public void deleteAll() {
        repo.deleteAll();

    }
}
