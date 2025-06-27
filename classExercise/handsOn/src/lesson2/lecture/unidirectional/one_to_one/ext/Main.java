package lesson2.lecture.unidirectional.one_to_one.ext;

import lesson2.lecture.unidirectional.one_to_one.Customer;
import lesson2.lecture.unidirectional.one_to_one.Item;
import lesson2.lecture.unidirectional.one_to_one.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Tom");
        ShoppingCart shoppingCart = customer.getShoppingCart();
        shoppingCart.addItem(new Item("Pen"));
        shoppingCart.addItem(new Item("Pencil"));
        System.out.println(shoppingCart.getItems());
    }
}
