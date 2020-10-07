public abstract class Customer {
    private ShoppingCart cart;
    private Order order;

    public ShoppingCart getCart() {
        return cart;
    }
    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public Order getOrder() {
        return order;
    }
    public void setOrder(Order order) {
        this.order = order;
    }

    public void addItemToCart(Item item) {

    }

    public void removeItemFromCart(Item item) {

    }
}
