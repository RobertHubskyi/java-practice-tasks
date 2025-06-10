package org.example.Module_08_Classes_And_Objects_Deep;

public class FinalExample {
    final String language = "Java";
    final int version;

    public FinalExample(int version) {
        this.version = version;
    }


    public void printInfo(){
        System.out.println("Я програмую на мові " + language + ", версія: " + version);
    }

    public static void main(String[] args) {
        FinalExample example = new FinalExample(21);
        example.printInfo();
        
    }
}
