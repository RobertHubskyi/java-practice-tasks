package org.example.Module_09_Packages_Access_Modifiers_Imports.Model;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void greet(){
        System.out.println("Привіт, я - " + name);
    }
}
