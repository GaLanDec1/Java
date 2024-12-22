public class Order {
    private String orderType;
    private String itemName;
    private int quantity;
    private double price;

    public Order(String orderType, String itemName, int quantity, double price) {
        this.orderType = orderType;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getOrderType() {
        return orderType;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double calculateTotalPrice() {
        return quantity * price;
    }
}
