package org.example.Module_13_FileIO.ReadingFromFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadWholeFileAsString {
    public static void main(String[] args) {
            try {
                String content = Files.readString(Path.of("text.txt"));
                System.out.println("Вміст файлу: ");
                System.out.println(content);
            }catch (IOException e){
                System.out.println("Помилка: " + e);
            }
    }
}
