package org.example.Module_12_Collections.Collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    @Override
    public String toString() {
        return "Book: " + title + ", автор: "
                + author + ", isbn: " + isbn;
    }


    public static void main(String[] args) {
        Book book1 = new Book("Гаррі Поттер", "Джуан Роулінг", "124561");
        Book book3 = new Book("Залізне полум'я", "Ребекка Яррос", "581941");
        Book book2 = new Book("Гаррі Поттер", "Джуан Роулінг", "124561");

        Set<Book> library = new HashSet<>();
        library.add(book1);
        library.add(book2);
        library.add(book3);
        System.out.println("Всі унікальні книги: ");
        for (Book books : library){
            System.out.println(" - " + books);
        }

    }
}
