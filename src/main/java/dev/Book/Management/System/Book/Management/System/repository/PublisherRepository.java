package dev.Book.Management.System.Book.Management.System.repository;

import dev.Book.Management.System.Book.Management.System.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
