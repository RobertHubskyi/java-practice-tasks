package org.example.Module_08_Classes_And_Objects_Deep;



public class UserRoleEnum {
    public enum Role {
        Admin("Адміністратор"),
        User("Користувач");

        private final String description;

        Role(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }
}

