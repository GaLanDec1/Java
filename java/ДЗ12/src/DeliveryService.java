public abstract class DeliveryService {
    public abstract Order createOrder(String itemName, int quantity, double price);

    public void deliver(Order order) {
        System.out.println("Доставка заказа:");
        System.out.println("  Тип заказа: " + order.getOrderType());
        System.out.println("  Детали: " + order.getItemName() + " x" + order.getQuantity());
        System.out.println("  Общая стоимость: $" + order.calculateTotalPrice());
        System.out.println("  Статус: В пути.");
    }
}
