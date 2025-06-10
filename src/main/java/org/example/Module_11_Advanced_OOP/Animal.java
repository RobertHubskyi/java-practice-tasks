package org.example.Module_11_Advanced_OOP;

abstract class Animal {
    public abstract void makeSound();

    public void sleep(){
        System.out.println("Тварина спить");

    }

    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat()
        };

        for (Animal animal : animals){
            animal.makeSound();
        }
    }
}
