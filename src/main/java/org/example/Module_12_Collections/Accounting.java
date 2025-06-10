package org.example.Module_12_Collections;

import java.util.HashMap;
import java.util.Map;

public class Accounting {
    public static void main(String[] args) {
        Map<String, Integer> products = new HashMap<>();
        products.put("Milk", 42);
        products.put("Bread", 17);
        products.put("Butter", 62);
        products.put("Bread", products.get("Bread") + 8);



        System.out.println("Список продуктів: ");
        for (Map.Entry<String, Integer> entry : products.entrySet() ){
            System.out.println( " - " + entry);
        }

        int total = 0;
        for (int quantity : products.values()){
            total += quantity;
        }
        System.out.println("Загальна кількість товарів: " + total);

    }
}
