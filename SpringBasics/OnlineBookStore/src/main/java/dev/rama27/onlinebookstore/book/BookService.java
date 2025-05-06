package dev.rama27.onlinebookstore.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
    public void addBook(Book book) throws BookAlreadyExist {
        if (repo.existsByIsbn(book.getIsbn())) {
            throw new BookAlreadyExist("Book with id " + book.getId() + " already exists");
        }
        repo.save(book);
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
    public Optional<Object> getBooksByAuthor(String author) {
        return Optional.ofNullable(repo.findAllByAuthor(author));
    }


    @Override
    public List<Book> getBooksByTitle(String title) {
            return repo.findByTitleContaining(title);
    }

    @Override
    public Page<Book> getBooksByTitleContaining(String title,Pageable pageable) {
        Page<Book> Books=repo.findBooksByTitleContainingIgnoreCase(title,  pageable);
        return Books;
    }

    @Override
    public List<Book> getBooksByAuthorAndGenre(String author, String genre) {
        List<Book> res=repo.findByAuthorAndGenre(author,genre);
        return res;
    }


    @Override
    public List<Book> getBooksByGenre(String genre) {
        List<Book> res=repo.findByGenre(genre);
        return res;
    }


    @Override
    public void deleteAll() {
        repo.deleteAll();

    }
}
