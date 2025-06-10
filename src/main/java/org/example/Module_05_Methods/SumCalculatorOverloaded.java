package org.example.Module_05_Methods;

public class SumCalculatorOverloaded {

    public int calculateSum(int a, int b) {
        return a + b;
    }

    public int calculateSum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        SumCalculatorOverloaded sum = new SumCalculatorOverloaded();

        System.out.println("Сума: " + sum.calculateSum(2, 3));
        System.out.println("Сума: " + sum.calculateSum(3, 2, 1));
    }
}
