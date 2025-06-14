package org.example.Module_12_Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseDigits_Stack {
    public static void main(String[] args) {
        int number = 12345;

        Deque<Integer> stack = new ArrayDeque<>();

        while (number > 0) {
            int digit = number % 10;
            stack.push(digit);
            number = number / 10;
        }


        System.out.println("Цифри, які були розбиті з числа: ");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println();
    }
}
