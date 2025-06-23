package org.example.Module_13_FileIO.Directories;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ListDirectoryContents {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("logs");

        if (Files.exists(path) && Files.isDirectory(path)){
            System.out.println("Вміст директорії '" + path +"': ");
            try(DirectoryStream<Path> stream = Files.newDirectoryStream(path)){
                for (Path entry : stream){
                    System.out.println(" - " + entry.getFileName());
                }
            }catch (IOException e){

                System.out.println("Помилка читання директорії: " +e.getMessage());
            }
        } else {
            System.out.println("Директорію незнайдено або це не папка");
        }
    }
}
