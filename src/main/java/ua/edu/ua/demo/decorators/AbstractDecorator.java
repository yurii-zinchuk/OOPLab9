package ua.edu.ua.demo.decorators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.edu.ua.demo.items.Item;

@Getter
@Setter
public abstract class AbstractDecorator extends Item {
    private Item item;
    private double price;
    protected String description;

    public AbstractDecorator(Item item, double price, String description) {
        setItem(item);
        setPrice(price+item.price());
        setDescription(item.getDescription()+description);
    }

    protected AbstractDecorator() {
    }

    @Override
    public double price() {
        return price;
    }

    public Item getItem() {
        return item;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
