package org.example.Module_12_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class SupportQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Remind me of childhood");
        queue.offer("Remind me about meeting");
        queue.offer("Go to work");

        int i = 1;

        while (!queue.isEmpty()) {
            System.out.println(i + ". Обробка заявки: " + queue.poll());
            i++;

        }
        System.out.println("Всі заявки оброблено!");
    }
}
