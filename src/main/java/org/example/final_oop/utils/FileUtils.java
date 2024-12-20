package org.example.final_oop.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtils {

    // Save content to a file
    public static void saveToFile(String content, Path path) throws IOException {
        Files.write(path, content.getBytes());
    }

    // Check if a file exists
    public static boolean fileExists(Path path) {
        return Files.exists(path);
    }

    // Delete a file
    public static boolean deleteFile(Path path) throws IOException {
        return Files.deleteIfExists(path);
    }
}
