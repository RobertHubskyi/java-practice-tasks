package org.example.Module_12_Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_HistoryExample {
    public static void main(String[] args) {
        Deque<String> browserHistory = new ArrayDeque<>();

        browserHistory.addFirst("google.com");
        browserHistory.addFirst("youTube.com");
        browserHistory.addFirst("github.com");

        System.out.println("Поточна сторінка: " + browserHistory.peekFirst());

        System.out.println("Назад до: " + browserHistory.removeFirst());

        System.out.println("Зараз на: " + browserHistory.peekFirst());

        System.out.println("Назад до: " + browserHistory.removeFirst());

        System.out.println("Поточна сторінка: " + browserHistory.peekFirst());


    }
}
