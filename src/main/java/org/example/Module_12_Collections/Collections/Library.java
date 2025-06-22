package org.example.Module_12_Collections.Collections;

import java.util.HashSet;
import java.util.Set;

public class Library {
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();

        books.add(new Book("У розрідженому повітрі", "Джон Кракауер", " 32184901797491"));
        books.add(new Book("1984", "Джордж Орвел", "289174819"));
        books.add(new Book("Пікнік на узбіччі", "Брати Стругацькі", "9871298421"));

        System.out.println("Книги в бібліотеці: ");
        for (Book book : books){
            System.out.println(" - " + book);
        }
    }
}
