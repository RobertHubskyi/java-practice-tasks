package org.example.Module_09_Packages_Access_Modifiers_Imports.Model;

public class Document {
    private String title;
    protected String author;
    int pages;

    public Document(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void printInfo() {
        System.out.println("Назва документу: " + title + ", автор: " + author + ", сторінок: " + pages);
    }
}
