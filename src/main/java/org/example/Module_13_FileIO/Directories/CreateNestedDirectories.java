package org.example.Module_13_FileIO.Directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateNestedDirectories {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("logs/2025/06");

       try {
           Files.createDirectories(path);
           System.out.println("Папки створено: " + path);
       } catch (IOException e){
           System.out.println("Помилка створення: " + e.getMessage());
       }
    }
}
