package org.example.Module_11_Advanced_OOP;

public class Main_Notifier {
    public static void main(String[] args) {
        Notifier[] notifiers = {
          new EmailNotifier(),
          new SmsNotifier(),
          new PushNotifier()
        };

        NotificationService notificationService = new NotificationService(notifiers);
        notificationService.notifyAll("Завтра о 10 ранку відключення світла");
    }
}
