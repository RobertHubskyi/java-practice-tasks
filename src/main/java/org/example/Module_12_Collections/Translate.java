package org.example.Module_12_Collections;

import java.util.HashMap;
import java.util.Map;

public class Translate {
    public static void main(String[] args) {


        Map<String, String> trslt = new HashMap<>();

        trslt.put("English", "Англійська");
        trslt.put("Pineapple", "Ананас");
        trslt.put("Car", "Машина");
        trslt.put("Bus", "Автобус");

        System.out.println("Переклад слова 'Car': " + trslt.get("Car"));
        System.out.println("\nПереклад повного списку слів: ");
        for (Map.Entry<String, String> entry : trslt.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
