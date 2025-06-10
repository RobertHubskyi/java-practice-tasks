package org.example.Module_04_Arrays;

import java.util.Scanner;

import static java.lang.System.in;

public class ArrayInputFromUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        System.out.println("Введіть кількість елементів: ");
        int size = scan.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Введіть елемент # " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
        }
        System.out.println("Введений масив: ");
        for (int num : numbers) {
            System.out.println(num);
        }

    }
}
