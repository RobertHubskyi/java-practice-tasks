package org.example.Module_13_FileIO.ReadingFromFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;

import java.util.List;

public class FileInfo {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");


        if (file.exists()) {
            System.out.println("Файл вже існує.");
        } else {
            if (file.createNewFile()) {
                System.out.println("Файл створено.");
            } else {
                System.out.println("Не вдалося створити файл.");
            }
        }


        System.out.println("Чи існує файл: " + file.exists());
        System.out.println("Ім'я файлу: " + file.getName());
        System.out.println("Повний шлях до файлу: " + file.getAbsolutePath());
        System.out.println("Чи це файл? " + file.isFile());

        List<String> lines = List.of(
                "Привіт, Java, це перший рядок",
                "Привіт, Java, другий рядок",
                "Привіт, Java, а це третій "
        );

        Files.write(Path.of("text.txt"), lines);
        System.out.println("Рядки записані у файл");
    }
}
