package lesson2.lecture.bidirectional.one_to_one_factory;

public class Customer {
    private String customerName;
    private ShoppingCart shoppingCart;

     Customer(String customerName) {
        this.customerName = customerName;
      //  this.shoppingCart = new ShoppingCart(this); //pass curr Customer obj
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        if (shoppingCart == null) {
            throw new NullPointerException("ShoppingCart is null");
        }
        this.shoppingCart = shoppingCart;
        //return shoppingCart;
    }
    public ShoppingCart getCustomerShoppingCart() {
        return shoppingCart;
    }
}
