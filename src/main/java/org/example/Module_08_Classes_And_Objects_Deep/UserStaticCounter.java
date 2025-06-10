package org.example.Module_08_Classes_And_Objects_Deep;

public class UserStaticCounter {
    private String name;
    private static int userCount = 0;

    public UserStaticCounter(String name) {
        this.name = name;
        userCount++;
    }

    public void printInfo() {
        System.out.println("Ім'я користувача: " + name);
    }

    public static void printCount() {
        System.out.println("Кількість користувачів: " + userCount);
    }

    public static void main(String[] args) {
        UserStaticCounter[] users = {
                new UserStaticCounter("Robert"),
                new UserStaticCounter("Bob"),
                new UserStaticCounter("Den"),

        };
        for(UserStaticCounter u : users){
            u.printInfo();
        }
        UserStaticCounter.printCount();
    }

}
