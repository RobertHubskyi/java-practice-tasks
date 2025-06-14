package org.example.Module_12_Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    public static void main(String[] args) {

        Deque<String> forwardStack = new ArrayDeque<>();
        Deque<String> backStack = new ArrayDeque<>();

        String currentPage = "Home";


        currentPage = visit("google.com", currentPage, backStack, forwardStack);
        currentPage = visit("github.com", currentPage, backStack, forwardStack);
        currentPage = visit("youtube.com", currentPage, backStack, forwardStack);



        currentPage = back(currentPage, forwardStack, backStack);
        currentPage = back(currentPage, forwardStack, backStack);


        currentPage = forward(currentPage, forwardStack, backStack);

    }

    public static String visit(String url, String currentPage,
                               Deque<String> backStack, Deque<String> forwardStack){
        backStack.push(currentPage);
        forwardStack.clear();
        System.out.println("Зараз на: " + url);
        return url;
    }

    public static String back(String currentPage, Deque<String> forwardStack, Deque<String> backStack){
        if (backStack.isEmpty()){
            System.out.println("Немає сторінок назад");
            return currentPage;
        }
        forwardStack.push(currentPage);
        String previousPage = backStack.pop();
        System.out.println("Назад до: " + previousPage);
        return previousPage;
    }

    public static String forward(String currentPage, Deque<String> forwardStack, Deque<String> backStack){
        if (forwardStack.isEmpty()){
            System.out.println("Немає сторінок вперед");
            return currentPage;
        }
        backStack.push(currentPage);
        String nextPage = forwardStack.pop();
        System.out.println("Вперед до: " + nextPage);
        return nextPage;
    }
}
