package ua.edu.ua.demo.decorators;

import ua.edu.ua.demo.items.Item;

public class BasketDecorator extends ItemDecorator {

    public BasketDecorator(Item item) {
        super(item);
        description = "decorated with basket.";
    }

    @Override
    public double price() {
        return 4 + item.price();
    }

    @Override
    public double getPrice() {
        return price();
    }
}
