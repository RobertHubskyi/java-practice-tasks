package org.example.Module_12_Collections.Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Collections {
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();

        books.add(new Book("1984", "Джордж Орвел", "123456"));
        books.add(new Book("Пікнік на узбіччі", "Брати Стругацькі", "987654"));
        books.add(new Book("Колгосп тварин", "Джордж Орвел", "112233"));
        books.add(new Book("Хмарний атлас", "Девід Мітчелл", "998877"));

        Map<String, Integer> authorCount = new HashMap<>();

        for (Book book : books){
            String author = book.getAuthor();
            authorCount.put(author, authorCount.getOrDefault(author, 0) + 1);
        }

        System.out.println("Кількість книг кожного автора: ");
        for (Map.Entry<String, Integer> entry : authorCount.entrySet()){
            System.out.println("Автор: " + entry.getKey() + ", кількість книг: " + entry.getValue());
        }
    }
}
