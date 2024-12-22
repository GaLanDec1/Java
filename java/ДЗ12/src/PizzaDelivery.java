public class PizzaDelivery extends DeliveryService {
    @Override
    public Order createOrder(String itemName, int quantity, double price) {
        return new Order("Пицца", itemName, quantity, price);
    }
}
