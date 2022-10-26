package ua.edu.ua.demo.flowers;

import ua.edu.ua.demo.flowers.Flower;
import ua.edu.ua.demo.flowers.FlowerColor;

public class RomashkaFlower extends Flower {
    public RomashkaFlower(FlowerColor color, double sepalLength, double price) {
        super(color, sepalLength, price);
    }

    @Override
    public double price() {
        return price;
    }
}
