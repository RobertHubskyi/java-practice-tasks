package org.example.Module_12_Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return title + " - " + author + " (" + pages + "стор.)";
    }

    public static void main(String[] args) {


        Map<String, List<Book>> book = new HashMap<>();

        book.putIfAbsent("Fantasy", new ArrayList<>());
        book.get("Fantasy").add(new Book("Harry Potter and Sorcerer's Stone", "J.K.Rowling", 309));
        book.get("Fantasy").add(new Book("The Hobbit", "J.J.R.Tolkien", 310));
        book.get("Fantasy").add(new Book("The Name of the Wind", "Patrick Rothfuss", 662));

        book.putIfAbsent("Science fiction", new ArrayList<>());
        book.get("Science fiction").add(new Book("Dune", "Frank Herbert", 412));
        book.get("Science fiction").add(new Book("Ender's Game", "Orson Scott Card", 324));
        book.get("Science fiction").add(new Book("Neuromancer", "Willam Gibson", 412));

        book.putIfAbsent("History", new ArrayList<>());
        book.get("History").add(new Book("Sapiens: A Brief History of Humankind",
                "Yuval Noah Harry", 443));
        book.get("History").add(new Book("Guns, Germs, and Steel", "Jared Diamond", 480));
        book.get("History").add(new Book("The Silk Roads: a new History of the World",
                "Petter Frankopan", 636));

        for (Map.Entry<String, List<Book>> entry : book.entrySet()) {
            System.out.println("\nЖанр: " + entry.getKey());
            for (Book book1 : entry.getValue()) {
                System.out.println(" - " + book1);
            }
        }
        int grandTotal = 0;
        for (Map.Entry<String, List<Book>> entry : book.entrySet()) {
            int total = 0;
            for (Book book1 : entry.getValue()) {
                total += book1.getPages();
            }
            grandTotal += total;
            System.out.println("Загальна кількість книг у жанрі: " + entry.getKey()
                    + ": " + total + " сторінок");
        }
        System.out.println("Загальна кількість сторінок у всіх жанрах: " + grandTotal);
    }
}
