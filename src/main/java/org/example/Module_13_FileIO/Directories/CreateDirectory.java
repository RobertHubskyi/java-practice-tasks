package org.example.Module_13_FileIO.Directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateDirectory {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("logs");

        if (Files.exists(path)){
            System.out.println("Папка вже існує");
        } else {
            try {
                Files.createDirectory(path);
                    System.out.println("Папку створено");
                }catch (IOException e){
                System.out.println("Помилка створення папки: " + e.getMessage());
            }
        }
    }
}
