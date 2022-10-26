package ua.edu.ua.demo.decorators;

import lombok.AllArgsConstructor;
import ua.edu.ua.demo.items.Item;

@AllArgsConstructor
public abstract class ItemDecorator extends Item {
    protected Item item;

    public abstract double getPrice();
}
