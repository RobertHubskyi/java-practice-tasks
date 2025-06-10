package org.example.Module_07_OOP;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduction(){
        System.out.println("Мене звати: " + name + ", мені " + age + " років");
    }

    public static void main(String[] args) {
        Person person = new Person("Robert", 22);
        person.introduction();
    }
}


