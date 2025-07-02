package lesson2.lecture.bidirectional.one_to_one;

public class Customer {
    private String customerName;
    private ShoppingCart shoppingCart;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.shoppingCart = new ShoppingCart(this); //pass curr Customer obj
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public String getCustomerName() {
        return customerName;
    }
}
