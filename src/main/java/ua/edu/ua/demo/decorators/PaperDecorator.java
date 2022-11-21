package ua.edu.ua.demo.decorators;

import lombok.NoArgsConstructor;
import ua.edu.ua.demo.items.Item;

public class PaperDecorator extends AbstractDecorator {
    public PaperDecorator(Item item) {
        super(item, 13, "decorated with paper ");
    }
}
