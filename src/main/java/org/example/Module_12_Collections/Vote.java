package org.example.Module_12_Collections;

import java.util.*;

public class Vote {
    public static void main(String[] args) {

        List<String> votes = Arrays.asList(
                "Lisa", "Bob", "Jack", "Lisa", "Carlo", "Carlo", "Lisa"
        );

        Map<String, Integer> voteCount = new HashMap<>();

        for (String name : votes) {
            if (voteCount.containsKey(name)){
                voteCount.put(name, voteCount.get(name) + 1);
            } else {
                voteCount.put(name, 1);
            }
        }

        System.out.println("Результати голосування: ");
        for (Map.Entry<String, Integer> entry : voteCount.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
