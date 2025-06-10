package org.example.Module_10_Object_class_Overrides;

public class User {
    private String name;
    private Address address;

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Robert", new Address("Lviv", "Pid Holoskom", 21)),
                new User("Robert", new Address("Lviv", "Chervonoy Calunu", 8)),

        };

        for (User user : users){
            System.out.println(user);
        }
    }
}
