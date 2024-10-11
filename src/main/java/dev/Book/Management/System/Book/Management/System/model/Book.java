package dev.Book.Management.System.Book.Management.System.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;

    private final String title;
    private final String isbn;
    private final LocalDate publishedDate;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private final Author author;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private final Category category;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private final Publisher publisher;
}