package dev.Book.Management.System.Book.Management.System.repository;

import dev.Book.Management.System.Book.Management.System.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
