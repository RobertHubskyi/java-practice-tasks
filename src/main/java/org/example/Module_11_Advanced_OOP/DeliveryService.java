package org.example.Module_11_Advanced_OOP;

import java.util.List;

public class DeliveryService {
    public void deliverAll(List<DeliverAble> couriers, String item, String address){
        for( DeliverAble deliverAble : couriers){
            deliverAble.deliver(item, address);
        }

    }
}
