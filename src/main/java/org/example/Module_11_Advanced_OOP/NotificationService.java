package org.example.Module_11_Advanced_OOP;

public class NotificationService {
    private Notifier[] notifiers;

    public NotificationService(Notifier[] notifiers) {
        this.notifiers = notifiers;
    }

    public void notifyAll(String message){
        for (Notifier notifier : notifiers){
            notifier.send(message);
        }
    }
}
