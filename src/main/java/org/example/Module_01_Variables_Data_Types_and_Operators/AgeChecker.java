package org.example.Module_01_Variables_Data_Types_and_Operators;

public class AgeChecker {
    public static void main(String[] args) {
        int age = 20;
        boolean isAdult = age >= 18;
        System.out.println("Повнолітній? " + isAdult);

        if (isAdult) {
            System.out.println("Доступ дозволено");
        } else {
            System.out.println("Доступ заборонено");
        }

    }
}

