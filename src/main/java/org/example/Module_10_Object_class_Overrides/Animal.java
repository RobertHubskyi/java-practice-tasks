package org.example.Module_10_Object_class_Overrides;

public class Animal {

    public void makeSound() {
        System.out.println("Голос!");
    }

    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Dog(),
                new Animal()
        };


        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                System.out.println("Це собака: ");
                animal.makeSound();
            } else if (animal instanceof Cat) {
                System.out.println("Це кіт: ");
                animal.makeSound();
            } else {
                System.out.println("Невідома тварина");
                animal.makeSound();
            }
        }
    }

}
