public class FactoryMethodDemo {
    public static void main(String[] args) {
        // Создаем службы доставки
        DeliveryService pizzaService = new PizzaDelivery();
        DeliveryService groceryService = new GroceryDelivery();

        // Создаем заказы
        Order pizzaOrder = pizzaService.createOrder("Маргарита", 2, 12.99);
        Order groceryOrder = groceryService.createOrder("Яблоки", 5, 1.5);

        // Доставляем заказы
        pizzaService.deliver(pizzaOrder);
        groceryService.deliver(groceryOrder);
    }
}
