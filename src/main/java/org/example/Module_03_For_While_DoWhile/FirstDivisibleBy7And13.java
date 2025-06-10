package org.example.Module_03_For_While_DoWhile;

public class FirstDivisibleBy7And13 {
    public static void main(String[] args) {
        int i = 1;

        do {
            if (i % 7 == 0 && i % 13 == 0 ){
                System.out.println("Число, що ділиться на 7 і 13: " + i);

            }
            i++;
        }while (i <= 1000);
    }
}
