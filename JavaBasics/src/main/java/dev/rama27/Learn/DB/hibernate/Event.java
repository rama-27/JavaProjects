package dev.rama27.Learn.DB.hibernate;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name="Events")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Event {
    @Id
    @GeneratedValue
    private long id;

    private String title;

    @Column(name="eventDate")
    private LocalDateTime date;

    public Event(String ourVeryFirstEvent, LocalDateTime now) {
        this.title=ourVeryFirstEvent;
        this.date=now;
    }
}
