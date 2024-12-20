package org.example.final_oop.service;

import org.example.final_oop.entity.User;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserService userService;

    public AuthService(UserService userService) {
        this.userService = userService;
    }

    // Simulated authentication without security
    public String authenticateUser(String username, String password) {
        User user = userService.getUserByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            // Simulate successful login by returning a success message
            return "Login successful for user: " + username;
        } else {
            throw new RuntimeException("Invalid username or password");
        }
    }
}
