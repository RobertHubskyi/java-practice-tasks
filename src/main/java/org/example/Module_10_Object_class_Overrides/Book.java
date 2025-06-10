package org.example.Module_10_Object_class_Overrides;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';


    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Book book = (Book) obj;
        return title.equals(book.title) && author.equals(book.author);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Basics", "John Smith");
        Book book2 = new Book("Java Basics", "John Smith");

        System.out.println(book1 == book2);
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book2));

    }
}
