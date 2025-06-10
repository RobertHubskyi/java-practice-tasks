package org.example.Module_09_Packages_Access_Modifiers_Imports.Model;

public class Animal {
    String defaultField = "Я default";
    protected String protectedField = "Я протектед";

    public Animal(String defaultField, String protectedField) {
        this.defaultField = defaultField;
        this.protectedField = protectedField;
    }

    public void printField(){
        System.out.println(defaultField);
        System.out.println(protectedField);
    }
}
