package org.example.final_oop.service;

import org.example.final_oop.entity.User;
import org.example.final_oop.exception.ResourceNotFoundException;
import org.example.final_oop.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Register a new user
    public User registerUser(User user) {
        return userRepository.save(user); // Save user in the repository
    }

    // Get user by ID
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with ID " + id)); // Throw exception if not found
    }

    // Get user by username
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with username " + username)); // Handle user not found
    }

    // Get all users
    public List<User> getAllUsers() {
        return userRepository.findAll(); // Return a list of all users
    }

    // Update user details
    public User updateUser(Long id, User updatedUser) {
        User existingUser = getUserById(id); // Fetch the existing user by ID
        existingUser.setUsername(updatedUser.getUsername());
        existingUser.setEmail(updatedUser.getEmail());
        existingUser.setPassword(updatedUser.getPassword());
        return userRepository.save(existingUser); // Save the updated user
    }
}
