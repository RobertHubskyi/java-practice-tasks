package org.example.Module_13_FileIO.ReadingFromFiles;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadFileWithFilesAPI {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Path.of("text.txt"));
            System.out.println("Вміст файлу: ");
            for (String line : lines){
                System.out.println(" - " + line);
            }
        }catch (IOException e){
            System.out.println("Помилка читання: " + e.getMessage());
        }
    }
}
