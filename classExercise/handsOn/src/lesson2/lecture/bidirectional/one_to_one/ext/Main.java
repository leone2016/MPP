package lesson2.lecture.bidirectional.one_to_one.ext;

import lesson2.lecture.bidirectional.one_to_one.Customer;
import lesson2.lecture.bidirectional.one_to_one.Item;
import lesson2.lecture.bidirectional.one_to_one.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Leo");
        //ShoppingCart sp = new ShoppingCart(customer);

        ShoppingCart shoppingCart = customer.getShoppingCart();
        shoppingCart.addItem(new Item("laptop"));
        shoppingCart.addItem(new Item("tablet"));
        shoppingCart.addItem(new Item("mouse"));

        System.out.println(
                customer.getCustomerName()+ " added: +"+ shoppingCart.getItems() + " into the cart."
        );
    }
}
