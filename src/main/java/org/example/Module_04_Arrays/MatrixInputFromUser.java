package org.example.Module_04_Arrays;

import java.util.Scanner;

import static java.lang.System.in;

public class MatrixInputFromUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        System.out.println("Введіть кількість рядків: ");
        int rows = scan.nextInt();
        scan.nextLine();

        System.out.println("Введіть кількість стовпців: ");
        int cols = scan.nextInt();
        scan.nextLine();


        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.println("Введіть елемент [" + i + "][ " + j + "]: ");
                matrix[i][j] = scan.nextInt();

            }
        }
        System.out.println("Виведена матриця: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
