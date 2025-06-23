package org.example.Module_13_FileIO.WritingToFiles;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TextExample  {
    public static void main(String[] args)  throws IOException {
        List<String> lines = List.of(
                "Рядок 1: Привіт з Java!",
                "Рядок 2: Це запис у файл.",
                "Рядок 3: Успішно завершено."
        );

        Files.write(Path.of("output"), lines);
    }
}
