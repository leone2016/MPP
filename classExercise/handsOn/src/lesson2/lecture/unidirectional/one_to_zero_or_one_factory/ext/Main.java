package lesson2.lecture.unidirectional.one_to_zero_or_one_factory.ext;

import lesson2.lecture.unidirectional.one_to_zero_or_one_factory.Customer;
import lesson2.lecture.unidirectional.one_to_zero_or_one_factory.Items;
import lesson2.lecture.unidirectional.one_to_zero_or_one_factory.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Leonardo Medina");//no associated to shoppingcart

        ShoppingCart sc = ShoppingCart.createCart(customer);
        sc.add(new Items("Apple"));
        sc.add(new Items("Pear"));
        sc.add(new Items("Orange"));

        System.out.println(sc.getItems());

    }
}
