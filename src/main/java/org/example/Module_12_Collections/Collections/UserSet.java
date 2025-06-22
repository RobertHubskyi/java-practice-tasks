package org.example.Module_12_Collections.Collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class UserSet {
    private String name;
    private String email;

    public UserSet(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        UserSet userSet = (UserSet) object;
        return Objects.equals(name, userSet.name) && Objects.equals(email, userSet.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }

    @Override
    public String toString() {
        return name + " (" + email + ") ";
    }

    public static void main(String[] args) {
        Set<UserSet> users = new HashSet<>();

        users.add(new UserSet("Robert", "2314@gmail.com"));
        users.add(new UserSet("Bob", "2133414@gmail.com"));
        users.add(new UserSet("Robert", "2314@gmail.com"));


        System.out.println("Унікальні користувачі: ");
        for (UserSet user : users){
            System.out.println(" - " + user);
        }

    }
}
