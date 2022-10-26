package ua.edu.ua.demo.delivery;

import ua.edu.ua.demo.items.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery{
    @Override
    public List<Item> deliver(List<Item> toDeliver) {
        System.out.println("Delivered by post.");
        return toDeliver;
    }
}
