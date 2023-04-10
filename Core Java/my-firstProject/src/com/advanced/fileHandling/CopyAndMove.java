package com.advanced.fileHandling;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyAndMove {
    public static void main(String[] args) {
        Path originalPath = Paths.get("/src/com/advanced/fileHandling/JuliusCesar.txt");
        Path destinationPath = Paths.get("/src/com/advanced/io/JuliusCesar.txt");

        try {
            if (Files.exists(originalPath)) {
                Files.copy(originalPath, destinationPath);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
