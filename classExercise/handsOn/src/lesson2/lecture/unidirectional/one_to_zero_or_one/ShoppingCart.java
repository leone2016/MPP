package lesson2.lecture.unidirectional.one_to_zero_or_one;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Items> items;
    ShoppingCart() {
        items = new ArrayList<>();
    }
    public static ShoppingCart setCustomer(Customer customer) {
        if(customer == null) {
            throw new NullPointerException("Customer is null");
        }
        ShoppingCart shoppingCart = new ShoppingCart();
        customer.setShoppingCart(shoppingCart);

        return shoppingCart;
    }

    public void addItem(String apple) {
        this.items.add(new Items(apple));
    }

    public ArrayList<Items> getItems() {
        return items;
    }
}
