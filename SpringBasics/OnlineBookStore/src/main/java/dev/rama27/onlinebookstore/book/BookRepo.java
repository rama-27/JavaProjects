package dev.rama27.onlinebookstore.book;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepo extends JpaRepository<Book, Long> {
    List<Book> findByTitleContaining(String title);
    List<Book> findByAuthorContaining(String author);
    List<Book> findByCategoryId(long categoryId);
    List<Book> findAllByAuthor(String author);
}
