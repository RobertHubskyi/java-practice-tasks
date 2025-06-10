package org.example.Module_05_Methods;

public class SumCalculator {

    public int result(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        SumCalculator sum = new SumCalculator();

        System.out.println("Сума чисел: " + sum.result(2,5));
    }
}
