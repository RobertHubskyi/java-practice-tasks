package org.example.Module_08_Classes_And_Objects_Deep;

public class User {

    private String name;
    private UserRoleEnum.Role role;

    public User(String name, UserRoleEnum.Role role) {
        this.name = name;
        this.role = role;
    }

    public User(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Ім'я користувача: " + name + ", роль: " + role);
    }

    public static void main(String[] args) {
        User[] user = {
                new User("Robert", UserRoleEnum.Role.Admin),
                new User("Den", UserRoleEnum.Role.User),
                new User("Sol", UserRoleEnum.Role.User)
        };
        for (User users : user){
            users.printInfo();
        }
    }
}

