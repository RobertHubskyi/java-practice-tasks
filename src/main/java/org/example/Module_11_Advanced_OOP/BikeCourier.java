package org.example.Module_11_Advanced_OOP;

public class BikeCourier implements DeliverAble {
    @Override
    public void deliver(String item, String address) {
        System.out.println("Кур'єр доставляє: " + item + ", за адресом: " + address);
    }
}
