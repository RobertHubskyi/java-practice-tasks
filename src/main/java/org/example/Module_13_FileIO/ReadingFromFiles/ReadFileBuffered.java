package org.example.Module_13_FileIO.ReadingFromFiles;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileBuffered {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Помилка читання: " + e.getMessage());
        }


    }
}
