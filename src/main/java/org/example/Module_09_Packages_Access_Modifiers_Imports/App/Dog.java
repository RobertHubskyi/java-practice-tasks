package org.example.Module_09_Packages_Access_Modifiers_Imports.App;

import org.example.Module_09_Packages_Access_Modifiers_Imports.Model.Animal;

public class Dog extends Animal {
    public Dog(String defaultField, String protectedField) {
        super(defaultField, protectedField);
    }

    public void printInheritanceFields(){
        System.out.println(protectedField);
        //System.out.println(defaultField);
    }
}
