package org.example.Module_12_Collections;

public class Readable {
    private String title;
    public String author;

    public Readable(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "\" " + title + "\" by " + author;
    }
}
