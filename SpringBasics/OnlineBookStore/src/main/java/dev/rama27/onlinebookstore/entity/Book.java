package dev.rama27.onlinebookstore.entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;
    private String author;
    @Column(length = 2000)
    private String description;
    private BigDecimal price;
    private String imageUrl;
    @Column(unique = true)
    private String isbn;
    private Date publicationDate;
    @ManyToOne
    private Category category;
    
}



