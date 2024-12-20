package org.example.final_oop.exception;

public class InvalidTokenException extends RuntimeException {

    // Constructor that accepts a message
    public InvalidTokenException(String message) {
        super(message);
    }

    // Constructor that accepts both a message and a cause
    public InvalidTokenException(String message, Throwable cause) {
        super(message, cause);
    }
}
