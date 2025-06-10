package org.example.Module_03_For_While_DoWhile;

public class AllDivisibleBy7And13 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 1000) {
            if (i % 7 == 0 && i % 13 == 0){
                System.out.println("Число, що ділиться 7  і 13: " + i);
            }
            i++;
        }
    }
}
