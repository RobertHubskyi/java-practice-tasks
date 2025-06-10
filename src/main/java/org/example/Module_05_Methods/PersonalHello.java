package org.example.Module_05_Methods;

public class PersonalHello {

    public static void sayHello(String name){
        System.out.println("Привіт " + name);
    }

    public static void main(String[] args) {
        sayHello("Robert");
        sayHello("Den");
    }
}
