package org.example.Module_04_Arrays;

import java.util.Scanner;

import static java.lang.System.in;

public class StringArrayStartsWithA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        System.out.println("Введіть кількість рядків: ");
        int size = scan.nextInt();
        scan.nextLine();

        String[] text = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Введіть текст для рядка # " + (i + 1) + ": ");
            text[i] = scan.nextLine();

        }

        System.out.println("Слова, що починаються на А або з а");
        for (String word : text) {
            if (word.toLowerCase().startsWith("a")) {
                System.out.println(word);
            }
        }


    }
}
