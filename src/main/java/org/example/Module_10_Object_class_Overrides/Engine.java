package org.example.Module_10_Object_class_Overrides;

public class Engine implements Cloneable {
    private int horsePower;

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }



    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        Engine engine = new Engine(123);
        Car original = new Car("BMW", 2024, engine);
        Car copy = (Car) original.clone();

        original.getEngine().setHorsePower(300);
        original.printInfo();
        copy.printInfo();
    }
}
