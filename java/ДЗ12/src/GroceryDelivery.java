public class GroceryDelivery extends DeliveryService {
    @Override
    public Order createOrder(String itemName, int quantity, double price) {
        return new Order("Продукты", itemName, quantity, price);
    }
}
