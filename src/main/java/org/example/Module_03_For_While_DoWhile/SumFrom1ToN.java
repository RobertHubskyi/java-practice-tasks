package org.example.Module_03_For_While_DoWhile;

public class SumFrom1ToN {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Сума чисел від 1 до 100: " + sum);
    }
}
