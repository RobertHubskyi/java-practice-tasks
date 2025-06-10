package org.example.Module_04_Arrays;

import java.util.Scanner;

import static java.lang.System.in;

public class StringArrayInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        System.out.println("Введіть кількість рядків: ");
        int size = scan.nextInt();
        scan.nextLine();

        String[] words = new String[size];


        for (int i = 0; i < size; i++) {
            System.out.println("Введіть значення " + (i + 1) + " рядка: ");
            words[i] = scan.nextLine();

        }

        System.out.println();

        for (String word : words){
            System.out.println(word + "") ;
        }

    }
}
