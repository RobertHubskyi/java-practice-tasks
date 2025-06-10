package org.example.Module_12_Collections;

import java.util.LinkedList;

public class LinkedList_ToDoList {
    public static void main(String[] args) {

        LinkedList<String> todoList = new LinkedList<>();

        todoList.add("Wake up");
        todoList.add("Take a shower");
        todoList.add("Breakfast");
        todoList.add("Learning Java ");
        todoList.add("Go to gym");
        todoList.add("Buy groceries");
        todoList.add("Go to home");
        todoList.add("Take shower");
        todoList.add("Cook a breakfast");

        todoList.addFirst("Meditate");
        todoList.addLast("Go to sleep");



        todoList.remove(1);
        todoList.set(2, "Learning English");
        todoList.addLast("Relax");
        todoList.add(2, "Check email");


        todoList.removeIf(task -> task.contains("Buy groceries"));


        System.out.println("Список справ на день: ");
        System.out.println("----------------------");
        int i = 1;
        for (String todo : todoList){
            System.out.println(i + ". " + todo);
            i++;
        }

        todoList.clear();
        System.out.println("\nСписок очищено!");


        System.out.println("Список порожній: " + todoList.isEmpty());

    }
}
