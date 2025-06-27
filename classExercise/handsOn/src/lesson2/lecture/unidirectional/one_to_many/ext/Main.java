package lesson2.lecture.unidirectional.one_to_many.ext;

import lesson2.lecture.unidirectional.one_to_many.Customer;
import lesson2.lecture.unidirectional.one_to_many.Item;
import lesson2.lecture.unidirectional.one_to_many.Order;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Leonardo");
        //Order order = new Order(customer);error its a package access

        //First Order
        Order order = customer.addOrder();
        order.addItem(new Item("Note Book"));
        order.addItem(new Item("Pen"));
        order.addItem(new Item("Eraser"));

        //Second Order
        order = customer.addOrder();
        order.addItem(new Item("Bananas"));
        order.addItem(new Item("Water"));

        System.out.printf("Customer Name: \n" + customer.getCustomerName()+" \n Ordered: "+ customer.getOrders());



    }
}
