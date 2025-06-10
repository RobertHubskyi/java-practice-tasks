package org.example.Module_09_Packages_Access_Modifiers_Imports.App;

import org.example.Module_09_Packages_Access_Modifiers_Imports.Model.Book;

public class EBook extends Book {
    public EBook(String title, String author) {
        super(title, author);
    }

    public void printAuthor(){
        System.out.println("Автор: " + author);
    }
}
