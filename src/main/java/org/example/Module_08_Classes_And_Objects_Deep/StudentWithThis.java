package org.example.Module_08_Classes_And_Objects_Deep;

public class StudentWithThis {
    private int age;
    private String name;
    private double grade;

    public StudentWithThis(int age, String name, double grade) {
        this.age = age;
        this.name = name;
        this.grade = grade;
    }

    public StudentWithThis(int age, String name) {
        this(age, name, 0.0);
    }

    public StudentWithThis() {
        this(21, "Unknown", 0.0);
    }

    public void printInfo(){
        System.out.println("Рік народження: " + age + ", ім'я: " + name + ", середній бал: " + grade);
    }


    public static void main(String[] args) {
        StudentWithThis[] student = {
                new StudentWithThis(21, "Bob", 95),
                new StudentWithThis(27, "Jeff"),
                new StudentWithThis()
        };

        for (StudentWithThis student1 : student){
            student1.printInfo();
        }
    }
}
