package dev.rama27.onlinebookstore.book;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private UUID id;

    @Column(name="title" ,nullable = false)
    private String title;
    @Column(length = 500)
    private String author;
    @Column(length = 2000)
    private String description;
    private BigDecimal price;
    private String imageUrl;
    @Column(unique = true)
    private String isbn;
    private Date publicationDate;
    private String publisher;

    private String genre;

}


