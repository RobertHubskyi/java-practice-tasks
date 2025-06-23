package org.example.Module_13_FileIO.Directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteFileOrDirectory {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("logs/2025/06");

        if (Files.exists(path)){
            Files.delete(path);
            System.out.println("Файл видалено");
        } else {
            System.out.println("Файл або директорію не знайдено");
        }
    }
}
