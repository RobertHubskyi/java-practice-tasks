package org.example.Module_12_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_ClientService {
    public static void main(String[] args) {
        String[] clients = {
                "VIP: John",
                "Regular: Alice",
                "VIP: Sarah",
                "Regular: Bob",
                "Regular: Tom",
                "VIP: Emma"
        };

        Queue<String> normalClients = new LinkedList<>();
        Queue<String> vipClients = new LinkedList<>();

        for (String client : clients) {
            if (client.startsWith("VIP:")) {
                vipClients.offer(client);
            } else {
                normalClients.offer(client);
            }
        }

        int i = 1;
        System.out.println("Обробка vip-клієнтів: ");
        while (!vipClients.isEmpty()){
            System.out.println(i + ". " + vipClients.poll());
            i++;
        }


        System.out.println("Обробка клієнтів: ");
        while (!normalClients.isEmpty()){
            System.out.println(i + ". " + normalClients.poll());
            i++;
        }

        System.out.println("Обробка клієнтів завершена");

    }
}
