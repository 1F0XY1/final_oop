package org.example.final_oop.repository;

import org.example.final_oop.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    // You can add custom query methods here if needed
}
