package ua.edu.ua.demo.delivery;

import ua.edu.ua.demo.items.Item;

import java.util.List;

public interface Delivery {
    List<Item> deliver(List<Item> toDeliver);
}
