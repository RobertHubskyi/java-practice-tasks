package org.example.Module_12_Collections;

import java.security.Key;
import java.util.*;

public class Library {


    public static void main(String[] args) {
        Map<String, List<Readable>> readerBooks = new HashMap<>();

        readerBooks.put("Bob", new ArrayList<>(List.of(
                new Readable("1984", "George Orwell"),
                new Readable("Moby Dick", "Herman Melville")
        )));

        readerBooks.put("Den", new ArrayList<>(List.of(
                new Readable("Pride and Prejudice", "Jane Austen"),
                new Readable("Hamlet", "William Shakespeare")
        )));

        System.out.println("Книги в користуванні: " );
        for (Map.Entry<String, List<Readable>> entry : readerBooks.entrySet()){
            System.out.println("-" + entry.getKey() + ": ");
            for (Readable readable : entry.getValue()){
                System.out.println("    • " + readable);
            }
        }

        Set<Readable> uniqueReadable = new HashSet<>();
        for (List<Readable> readable : readerBooks.values()){
            uniqueReadable.addAll(readable);

        }

        Queue<Readable> returnQueue = new LinkedList<>();

        for (List<Readable> readable : readerBooks.values()) {
            returnQueue.addAll(readable);
        }

        System.out.println("\nЧерга повернення книг:");
        while (!returnQueue.isEmpty()) {
            System.out.println(" - Повернуто: " + returnQueue.poll());
        }

        for (List<Readable> readable : readerBooks.values()) {
            readable.clear();
        }

        System.out.println("\nУсі книги повернено, списки очищено.");
    }
}
