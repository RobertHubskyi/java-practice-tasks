package org.example.Module_13_FileIO.Directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;

public class DeleteNonEmptyDirectory {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("logs/2025/06");

        if (Files.exists(path)) {
            Files.walk(path)
                    .sorted(Comparator.reverseOrder())
                    .forEach(p -> {
                        try {
                            Files.delete(p);
                            System.out.println("Видалено: " + p);
                        } catch (IOException e) {
                            System.out.println("Не вдалося видалити: " + e + " -> " + e.getMessage());
                        }
                    });

            System.out.println("Директорію успішно видалено");
        } else {
            System.out.println("Директорію не знайдено");
        }

    }
}

