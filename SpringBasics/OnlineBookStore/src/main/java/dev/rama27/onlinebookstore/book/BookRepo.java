package dev.rama27.onlinebookstore.book;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BookRepo extends JpaRepository<Book, UUID> {
    List<Book> findByAuthorContainingIgnoreCase(String author);
    List<Book> findByTitleContainingIgnoreCase(String title);
    Book findByIsbn(String isbn);
    List<Book> findByTitleContaining(String title);
    List<Book> findByAuthorContaining(String author);
    List<Book> findAllByAuthor(String author);


    List<Book> findByGenre(String genre);
    List<Book> findByAuthorAndGenre(String author, String genre);

    boolean existsByTitle(String title);

    boolean existsByIsbn(String isbn);
}
