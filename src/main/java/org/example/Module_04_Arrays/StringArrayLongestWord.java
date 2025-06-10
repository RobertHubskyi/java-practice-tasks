package org.example.Module_04_Arrays;

import java.util.Scanner;

import static java.lang.System.in;

public class StringArrayLongestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        System.out.println("Введіть кількість рядків: ");
        int size = scan.nextInt();
        scan.nextLine();

        String[] words = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Введіть текст для цього рядка # " + (i + 1) + ": ");
            words[i] = scan.nextLine();

        }

        String longest = words[0];

        for (int i = 1; i < words.length; i++){
            if (words[i].length() > longest.length()){
                 longest = words[i];
            }
        }

        System.out.println("Слово: " + longest + ", його довжина: " + longest.length());

    }
}
