package lesson2.lecture.unidirectional.one_to_zero_or_one.ext;


import lesson2.lecture.unidirectional.one_to_zero_or_one.Customer;
import lesson2.lecture.unidirectional.one_to_zero_or_one.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Leonardo");

        ShoppingCart shoppingCart = ShoppingCart.setCustomer(customer);
        shoppingCart.addItem("Apple");
        shoppingCart.addItem("Orange");
        shoppingCart.addItem("Pineapple");

        System.out.println(shoppingCart.getItems());
    }
}
