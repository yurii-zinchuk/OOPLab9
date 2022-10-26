package ua.edu.ua.demo.flowers;

import lombok.Getter;
import ua.edu.ua.demo.items.Item;


@Getter
public class FlowerPack extends Item{
    private final Flower flower;
    private final int amount;
    private final double price;

    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
        price = amount * flower.price();
    }

    @Override
    public double price() {
        return price;
    }
}
