// StatePatternDemo демонстрирует использование паттерна State для управления состоянием заказа.
public class StatePatternDemo {
    public static void main(String[] args) {
        // Создание заказа с начальным состоянием "Новый заказ".
        Order order = new Order(new NewOrderState());
        order.processOrder(); // Обработка нового заказа.

        // Переход в состояние "В процессе обработки".
        order.setState(new ProcessingState());
        order.processOrder(); // Обработка заказа в процессе.

        // Переход в состояние "Отправлен".
        order.setState(new ShippedState());
        order.processOrder(); // Обработка отправленного заказа.
    }
}
