package lesson2.lecture.unidirectional.one_to_many;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String customerName;
    private List<Order> orders;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.orders = new ArrayList<>(); // order can be empty
    }

    public Order addOrder() {
        Order newOrder = new Order(LocalDate.now());
        orders.add(newOrder);
        return newOrder;
    }
    public String getCustomerName() {
        return customerName;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
