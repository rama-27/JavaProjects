package dev.rama27.Learn.DB.hibernate;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Name{
    private String firstName;
    private String middleName;
    private String lastName;
}
