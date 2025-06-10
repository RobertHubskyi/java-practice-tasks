package org.example.Module_05_Methods;

public class PrintUserInfo {
    public static void printInfoUser(String name, int age){
        System.out.println("Ім'я: " + name + ", вік: " + age);
    }

    public static void main(String[] args) {
        printInfoUser("Robert", 22);
    }
}
