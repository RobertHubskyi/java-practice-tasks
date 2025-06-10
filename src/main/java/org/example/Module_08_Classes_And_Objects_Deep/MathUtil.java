package org.example.Module_08_Classes_And_Objects_Deep;

public class MathUtil {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int square(int a) {
        return a * a;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("Сума чисел: " + MathUtil.sum(3,5));
        System.out.println("Добуток чисел: " + MathUtil.multiply(4,6));
        System.out.println("Квадрат числа: " + MathUtil.square(7));
        System.out.println("Перевірка числа на парність: " + MathUtil.isEven(4));
    }
}
