package dev.Book.Management.System.Book.Management.System.repository;

import dev.Book.Management.System.Book.Management.System.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
