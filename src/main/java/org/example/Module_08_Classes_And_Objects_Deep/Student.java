package org.example.Module_08_Classes_And_Objects_Deep;

public class Student {
    private String name;
    private int age;
    private Address address;


    public Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Ім'я студента: " + name + ", вік: " + age + ", адреса: " + address;

    }

    public static void main(String[] args) {
        Address address = new Address("Lviv", "Linkolna", 23);
        Student student = new Student("Robert", 22, address);


        System.out.println(student);
    }
}
