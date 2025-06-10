package org.example.Module_11_Advanced_OOP;

public class PushNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Відправлено push-сповіщення: " + message);
    }
}
