package org.example.Module_10_Object_class_Overrides;

public class Car implements Cloneable {
    private String model;
    private int year;
    private Engine engine;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public Car(String model, int year, Engine engine) {
        this.model = model;
        this.year = year;
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Car cloned = (Car) super.clone();
        cloned.engine = (Engine) engine.clone();
        return cloned;
    }

    public void printInfo(){
        System.out.println("Модель: " + model + ", рік випуску: " + year + ", к.с: " + engine.getHorsePower());
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Car original = new Car("BMW", 2024);
        Car copy = (Car) original.clone();

        original.printInfo();
        copy.printInfo();
    }
}
