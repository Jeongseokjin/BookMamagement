package dev.Book.Management.System.Book.Management.System.repository;


import dev.Book.Management.System.Book.Management.System.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
