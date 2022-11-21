package ua.edu.ua.demo.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ua.edu.ua.demo.items.Item;

import javax.persistence.*;

@Getter
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Flower extends Item {
    @Id @GeneratedValue
    private Long id;
    private double sepalLength;
    public String color;
    private double price;

    public Flower(double sepalLength, String color, double price) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
    }

    @Override
    public double price() {
        return price;
    }

}
