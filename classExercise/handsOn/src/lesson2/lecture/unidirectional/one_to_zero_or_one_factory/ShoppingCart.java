package lesson2.lecture.unidirectional.one_to_zero_or_one_factory;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private ArrayList<Items> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public static ShoppingCart createCart(Customer customer) {
        if(customer == null) {
            throw new IllegalArgumentException("Customer is null");
        }
        ShoppingCart shoppingCart = new ShoppingCart();
        //set shopping cart in Customer class
        customer.setCart(shoppingCart);
        return shoppingCart;
    }
    public void add(Items item) {
        this.items.add(item);
    }

    public List<Items> getItems() {
        return items;
    }

}
