package org.example.Module_12_Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseWord_Stack {
    public static void main(String[] args) {
        String[] word = {
                "Hello",
                "Word",
                "Undo",
                "Java"
        };

        Deque<String> stack = new ArrayDeque<>();

        for (String words : word) {
            stack.push(words);
        }

        System.out.println("Слова у зворотньому напрямку: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
