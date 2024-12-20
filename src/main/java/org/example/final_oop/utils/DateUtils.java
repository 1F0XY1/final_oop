package org.example.final_oop.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    // Get the current date and time as a formatted string
    public static String getCurrentDateTime() {
        return LocalDateTime.now().format(FORMATTER);
    }

    // Parse a string into LocalDateTime
    public static LocalDateTime parseDateTime(String dateTime) {
        return LocalDateTime.parse(dateTime, FORMATTER);
    }

    // Format a LocalDateTime into a string
    public static String formatDateTime(LocalDateTime dateTime) {
        return dateTime.format(FORMATTER);
    }
}
