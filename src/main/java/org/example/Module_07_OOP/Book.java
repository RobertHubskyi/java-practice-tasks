package org.example.Module_07_OOP;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void info(){
        System.out.println("Назва книги: " + title + ", автор: " + author + ", рік: " + year);
    }

    public static void main(String[] args) {
        Book book = new Book("Гаррі Поттер і камінь чарівника", "Дж. К. Ролінг", 1977);
        book.info();
    }
}
