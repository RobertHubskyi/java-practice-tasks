package org.example.Module_13_FileIO.WritingToFiles;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class AppendToFile {
    public static void main(String[] args) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("buffered_output.txt", true))) {
            writer.write("New massage");
            writer.newLine();
            writer.write("Hello");
            writer.newLine();
            writer.write("Bye");
            System.out.println("Додано нові рядкі до buffered_output.txt");
        } catch (IOException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        try {
            String content = Files.readString(Path.of("buffered_output.txt"));
            System.out.println("Вміст файлу: ");
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Exception:  " + e.getMessage());
        }
    }
}
