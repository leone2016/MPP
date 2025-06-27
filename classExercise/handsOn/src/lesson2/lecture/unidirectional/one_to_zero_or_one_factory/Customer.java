package lesson2.lecture.unidirectional.one_to_zero_or_one_factory;

public class Customer {
    private String name;
    private ShoppingCart cart;

    public Customer(String name) {
        this.name = name;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public String getName() {
        return name;
    }

    public void setCart(ShoppingCart shoppingCart) {
        if (shoppingCart != null) {
            this.cart = shoppingCart;
        }
    }
}
