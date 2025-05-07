package dev.rama27.onlinebookstore.book;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface BookRepo extends JpaRepository<Book, UUID> {
    Page<Book> findByAuthorContainingIgnoreCase(String author,Pageable pageable);
    Page<Book> findByTitleContainingIgnoreCase(String title, Pageable pageable);
    Book findByIsbn(String isbn);

    Page<Book> findBooksByTitleContainingIgnoreCase(String title, Pageable pageable );
    Page<Book> findByTitleContaining(String title,Pageable pageable);
    Page<Book> findByAuthorContaining(String author, Pageable pageable);
    Page<Book> findAllByAuthor(String author, Pageable pageable);


    Page<Book> findByGenre(String genre,Pageable pageable);
    Page<Book> findByAuthorContainingIgnoreCaseAndGenre(String author, String genre, Pageable pageable);

    boolean existsByTitle(String title);

    boolean existsByIsbn(String isbn);

    Page<Book> findByAuthorContainingIgnoreCaseAndGenreContainingIgnoreCase(String author, String genre,
                                                        Pageable pageable);
}
