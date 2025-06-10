package org.example.Module_07_OOP;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Person[] people= {
                new Person("Den", 27),
                new Student("Robert", 22, "Політехніка"),
                new Student("Sol", 21, "ЛНУ")
        };

        for (Person person : people){
            person.introduction();
        }
    }
}
