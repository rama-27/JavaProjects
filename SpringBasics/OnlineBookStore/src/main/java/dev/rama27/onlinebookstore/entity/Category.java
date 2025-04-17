package dev.rama27.onlinebookstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
    @Id
    private long id;
    private String name;
    private String description;
}
