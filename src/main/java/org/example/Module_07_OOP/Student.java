package org.example.Module_07_OOP;

public class Student  extends  Person{
    private String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    public void study(){

        System.out.println("Я навчаюсь в університеті " + university);
    }

    @Override
    public void introduction() {
        System.out.println("Мене звати: " + getName() + ", мені " + getAge() + ". Я навчаюсь у " + university);
    }

    public static void main(String[] args) {
        Student student = new Student("Robert", 22, "Політехніка");
        student.introduction();

    }
}
