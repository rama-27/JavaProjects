package dev.rama27.onlinebookstore.book;

import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    @Override
    public Optional<Object> getBooksByAuthor(String author) {
        return Optional.ofNullable(repo.findAllByAuthor(author));
    }

//    @Override
//    public List<Book> getBooksByCategory(long categoryId) {
//        if (repo.existsById(categoryId)) {
//            return repo.findByCategoryId(categoryId);
//        }
//        return List.of();
//    }

    @Override
    public List<Book> getBooksByTitle(String title) {
            return repo.findByTitleContaining(title);
    }

    @Override
    public List<Book> getBooksByAuthorAndGenre(String author, String genre) {
        List<Book> res=repo.findByAuthorAndGenre(author,genre);
        return res;
    }

//    @Override
//    public List<Book> getBooksByAuthorAndCategory(String author, long categoryId) {
//        if (repo.existsById(categoryId)) {
//            return repo.findByAuthorAndCategoryId(author, categoryId);
//        }
//        return List.of();
//    }

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
