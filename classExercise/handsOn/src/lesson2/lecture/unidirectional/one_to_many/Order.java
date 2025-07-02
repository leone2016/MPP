package lesson2.lecture.unidirectional.one_to_many;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    private LocalDate orderDate;
    private List<Item> items;

     Order(LocalDate orderDate) { //package access
        this.orderDate = orderDate;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
         return items;
    }

    @Override
    public String toString() {
        return "\nOrder{" +
                "orderDate=" + orderDate +
                ", items=" + Arrays.toString(items.toArray()) +
                "}\n";
    }
}
