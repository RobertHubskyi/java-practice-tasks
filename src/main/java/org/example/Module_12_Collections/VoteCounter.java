package org.example.Module_12_Collections;

import java.util.HashMap;
import java.util.Map;

public class VoteCounter {
    public static void main(String[] args) {


        String[] votes = {
                "Alisa", "Bob", "Jack", "Alisa", "Den", "Jack", "Bob", "Alisa", "Alisa", "Jack"
        };

        Map<String, Integer> voteCount = new HashMap<>();
        for (String name : votes){
            if (voteCount.containsKey(name)){
                voteCount.put(name, voteCount.get(name) + 1);
            } else {
                voteCount.put(name, 1);
            }
        }

        System.out.println("Результат голосування: ");
        for (Map.Entry<String, Integer> entry : voteCount.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        int max = 0;
        String winner = "";
        for (Map.Entry<String, Integer> entry : voteCount.entrySet()){
            if (entry.getValue() > max){
                max = entry.getValue();
                winner = entry.getKey();
            }
        }

        System.out.println("Переможець: " + winner + ", кількість голосів: " + max);


    }
}
