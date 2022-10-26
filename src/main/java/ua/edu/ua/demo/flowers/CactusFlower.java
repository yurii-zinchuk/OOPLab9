package ua.edu.ua.demo.flowers;

import ua.edu.ua.demo.flowers.Flower;
import ua.edu.ua.demo.flowers.FlowerColor;

public class CactusFlower extends Flower {
    public CactusFlower(FlowerColor color, double sepalLength, double price) {
        super(color, sepalLength, price);
    }

    @Override
    public double price() {
        return price;
    }
}
