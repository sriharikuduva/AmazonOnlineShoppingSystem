import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void updateItemQuantity(Item item, int quantity) {
        item.setQuantity(quantity);
    }
    public boolean checkout() {
        return true;
    }
}
