package org.example.Module_12_Collections.Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GroupBooksByAuthor {
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();
        Map<String, Set<Book>> owners = new HashMap<>();

        books.add(new Book("1984", "Джордж Орвел", "123456"));
        books.add(new Book("Пікнік на узбіччі", "Брати Стругацькі", "987654"));
        books.add(new Book("Колгосп тварин", "Джордж Орвел", "112233"));
        books.add(new Book("Хмарний атлас", "Девід Мітчелл", "998877"));

        for (Book book : books){
            String author = book.getAuthor();
            owners.putIfAbsent(author, new HashSet<>());
            owners.get(author).add(book);
        }

        System.out.println("Книги за авторами: ");
        for (Map.Entry<String, Set<Book>> entry : owners.entrySet()){
            String author = entry.getKey();
            Set<Book> booksByAuthor = entry.getValue();

            System.out.println("\nАвтор: " + author);
            for (Book book : booksByAuthor){
                System.out.println(" - " + book);
            }
        }
    }
}
