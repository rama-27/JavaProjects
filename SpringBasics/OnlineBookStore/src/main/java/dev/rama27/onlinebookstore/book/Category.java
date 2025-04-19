package dev.rama27.onlinebookstore.book;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Category {
    @Id
    private long id;
    private String name;
    private String description;
}
