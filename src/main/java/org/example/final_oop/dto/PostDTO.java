package org.example.final_oop.dto;

import java.time.LocalDateTime;

public class PostDTO {

    private Long id;
    private String title;
    private String content;
    private String slug;
    private Long authorId; // Only include the author ID for the DTO
    private Long categoryId; // Include the category ID
    private LocalDateTime publishedAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Integer version;
    private boolean isScheduled;

    // Default constructor
    public PostDTO() {
    }

    // Constructor for easier initialization
    public PostDTO(Long id, String title, String content, String slug, Long authorId, Long categoryId,
                   LocalDateTime publishedAt, LocalDateTime createdAt, LocalDateTime updatedAt,
                   Integer version, boolean isScheduled) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.slug = slug;
        this.authorId = authorId;
        this.categoryId = categoryId;
        this.publishedAt = publishedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.version = version;
        this.isScheduled = isScheduled;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public LocalDateTime getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(LocalDateTime publishedAt) {
        this.publishedAt = publishedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public boolean isScheduled() {
        return isScheduled;
    }

    public void setScheduled(boolean scheduled) {
        isScheduled = scheduled;
    }
}
