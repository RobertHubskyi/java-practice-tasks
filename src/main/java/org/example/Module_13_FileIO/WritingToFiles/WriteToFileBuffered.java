package org.example.Module_13_FileIO.WritingToFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteToFileBuffered {
    public static void main(String[] args) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of("buffered_output.txt"))) {
            writer.write("The first line");
            writer.newLine();
            writer.write("The second line");
            writer.write(", the same lane");
            writer.newLine();
            writer.write("The third line");
            writer.newLine();
            System.out.println("Файл записано через: BufferedWriter.");
        }
        try {
            String content = Files.readString(Path.of("buffered_output.txt"));
            System.out.println("Вміст файлу: ");
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Помилка: " + e);
        }
    }
}

