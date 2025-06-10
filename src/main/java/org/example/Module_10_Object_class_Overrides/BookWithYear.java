package org.example.Module_10_Object_class_Overrides;
import java.util.Objects;

public class BookWithYear {
    private String title;
    private String author;
    private int year;

    public BookWithYear(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "BookWithYear{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", age=" + year +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        BookWithYear book = (BookWithYear) obj;
        return year == book.year &&
                title.equals(book.title) &&
                author.equals(book.author);
    }


    public static void main(String[] args) {
        BookWithYear b1 = new BookWithYear("Clean Code", "Robert Martin", 2008);
        BookWithYear b2 = new BookWithYear("Clean Code", "Robert Martin", 2008);

        System.out.println(b1.equals(b2));
        System.out.println("HashCode b1: " + b1.hashCode());
        System.out.println("HashCode b2: " + b2.hashCode());
    }
}
