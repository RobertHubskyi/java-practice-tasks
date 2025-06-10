package org.example.Module_03_For_While_DoWhile;

public class WhileSum {
    public static void main(String[] args) {
        int n = 50;
        int i = 0;
        int sum = 0;

        while (i <= n){
            sum += i;
            i++;
        }

        System.out.println("Сума чисел від 1 до 50: " + sum);
    }
}
