package org.example.final_oop.service;

import org.example.final_oop.entity.Category;
import org.example.final_oop.repository.CategoryRepository; // Import the CategoryRepository
import org.example.final_oop.entity.Post;
import org.example.final_oop.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final PostRepository postRepository;

    public CategoryService(CategoryRepository categoryRepository, PostRepository postRepository) {
        this.categoryRepository = categoryRepository;
        this.postRepository = postRepository;
    }

    // Create a new category
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    // Get all categories
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    // Get a category by ID
    public Category getCategoryById(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.orElseThrow(() -> new RuntimeException("Category not found"));
    }

    // Get all posts in a category
    public List<Post> getPostsByCategory(Long categoryId) {
        Category category = getCategoryById(categoryId);
        return category.getPosts();
    }
}
