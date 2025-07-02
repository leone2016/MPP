package lesson2.lecture.unidirectional.one_to_one;

/**
 * @autor Leonardo Medina
 */
public class Customer {
    private final String customerName;
    private final ShoppingCart shoppingCart;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.shoppingCart = new ShoppingCart();
    }

    public String getCustomerName() {
        return customerName;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
}
