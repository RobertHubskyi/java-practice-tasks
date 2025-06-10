package org.example.Module_09_Packages_Access_Modifiers_Imports.Model;

public class Book {
    private String title;
    protected String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void printInfo(){
        System.out.println("Назва: " + title + ", автор: " + author);
    }
}
