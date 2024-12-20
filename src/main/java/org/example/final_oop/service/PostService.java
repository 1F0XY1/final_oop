package org.example.final_oop.service;

import org.example.final_oop.entity.Post;
import org.example.final_oop.exception.ResourceNotFoundException;
import org.example.final_oop.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    // Create a new post
    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    // Get post by ID
    public Post getPostById(Long id) {
        return postRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Post not found with ID " + id));
    }

    // Get all posts
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    // Update an existing post
    public Post updatePost(Long id, Post updatedPost) {
        Post existingPost = getPostById(id); // Reuse getPostById to fetch the post
        existingPost.setTitle(updatedPost.getTitle());
        existingPost.setContent(updatedPost.getContent());
        return postRepository.save(existingPost);
    }

    // Delete a post by ID
    public void deletePost(Long id) {
        if (!postRepository.existsById(id)) {
            throw new ResourceNotFoundException("Post not found with ID " + id);
        }
        postRepository.deleteById(id);
    }
}
