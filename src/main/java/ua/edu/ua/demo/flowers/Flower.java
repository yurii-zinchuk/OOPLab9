package ua.edu.ua.demo.flowers;

import lombok.Getter;
import ua.edu.ua.demo.items.Item;

@Getter
public abstract class Flower extends Item {
    protected String color;
    protected double sepalLength;
    protected double price;

    public Flower(FlowerColor color, double sepalLength, double price) {
        setColor(color);
        this.sepalLength = sepalLength;
        this.price = price;
    }

    private void setColor(FlowerColor color) {
        this.color = color.toString();
    }

    @Override
    public double price() {
        return price;
    }
}
