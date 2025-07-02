package lesson2.lecture.unidirectional.one_to_one;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
