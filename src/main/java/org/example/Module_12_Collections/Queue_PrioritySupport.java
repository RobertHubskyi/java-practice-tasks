package org.example.Module_12_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_PrioritySupport {
    public static void main(String[] args) {
        String[] requests = {
                "Remind me to drink water",
                "URGENT: Cannot access account",
                "Send report by 6PM",
                "URGENT: System crash",
                "Schedule a meeting"
        };

        Queue<String> urgentQueue = new LinkedList<>();
        Queue<String> normalQueue = new LinkedList<>();

        for (String request : requests) {
            if (request.startsWith("URGENT:")) {
                urgentQueue.offer(request);
            } else {
                normalQueue.offer(request);
            }
        }

        int i = 1;
        System.out.println("Обробка термінових запитів: ");
        while (!urgentQueue.isEmpty()) {
            System.out.println(i + ". " + urgentQueue.poll());
            i++;

        }

        System.out.println("Обробка звичайних запитів: ");
        while (!normalQueue.isEmpty()) {
            System.out.println(i + ". " + normalQueue.poll());
            i++;

        }

        System.out.println("\nУсі заявки оброблено!");
    }
}
