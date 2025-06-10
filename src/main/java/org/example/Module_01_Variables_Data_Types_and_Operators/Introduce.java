package org.example.Module_01_Variables_Data_Types_and_Operators;

public class Introduce {
    private String name;
    private int age;

    public Introduce(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public static void main(String[] args) {
        Introduce person = new Introduce("Robert", 22);
        System.out.println("Мене звати: " + person.getName() + ", мені: " + person.getAge() );
    }
}
