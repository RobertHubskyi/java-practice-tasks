package org.example.Module_05_Methods;

public class FactorialCalculator {

    public static int factorial(int n) {
        if (n == 2) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("Факторіал: " + result);
    }
}

