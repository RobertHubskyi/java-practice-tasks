package org.example.Module_12_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Прокинутись");
        queue.offer("Прийняти душ");
        queue.offer("Поснідати");
        queue.offer("Почистити зуби");
        queue.offer("Вийти на роботу");

        System.out.println("Перший в черзі: " + queue.peek());

        int i = 1;
        while (!queue.isEmpty()){
            System.out.println(i + ". Оброблено: " + queue.poll());
            i++;
        }
        System.out.println("Всі завдання виконано");
    }
}
