package dev.rama27.onlinebookstore.book;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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



