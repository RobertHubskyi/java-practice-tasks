package org.example.Module_08_Classes_And_Objects_Deep;

public class BookWithThis {
    private String title;
    private String author;
    private int pages;

    public BookWithThis(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public BookWithThis(String title, String author) {
        this(title, author, 100);
    }

    public BookWithThis() {
        this("Unknown", "Unknown", 0);
    }

    public void printInfo() {
        System.out.println("Назва книги: " + title + ", автор: " + author + ", кількість сторінок: " + pages);
    }

    public static void main(String[] args) {
        BookWithThis[] book = {
                new BookWithThis("Гаррі Поттер", "Джуан Роулінг", 521),
                new BookWithThis("Мобі Дік", "Герман Мелвілл"),
                new BookWithThis()
        };
        for (BookWithThis book1 : book){
            book1.printInfo();
        }
    }
}
