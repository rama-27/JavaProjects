package dev.rama27.onlinebookstore.book;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepo extends JpaRepository<Book, Long> {
    List<Book> findByTitleContaining(String title);
    List<Book> findByAuthorContaining(String author);
    List<Book> findAllByAuthor(String author);

//    List<Book> findByCategoryId(long categoryId);
//    List<Book> findByAuthorAndCategoryId(String author, long categoryId);

    List<Book> findByGenre(Genre genre);
    List<Book> findByAuthorAndGenre(String author, Genre genre);

    boolean existsByTitle(String title);
}
