package org.example.Module_04_Arrays;

import java.util.Scanner;

import static java.lang.System.in;

public class StringArrayContainsLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        System.out.println("Введіть кількість рядків: ");
        int size = scan.nextInt();
        scan.nextLine();

        String[] texts = new String[size];


        for (int i = 0; i < size; i++){
            System.out.println("Введіть текст для рядка # " + (i + 1) + ": ");
            texts[i] = scan.nextLine();

        }
        System.out.println("Введіть літеру для пошуку: ");
        String letter = scan.nextLine();

        System.out.println("Слова, що починаються на літеру \"A \" або \"a\"");
        for (String word : texts){
            if (word.toLowerCase().contains(letter.toLowerCase())){
                System.out.println(word);
            }
        }
    }
}
