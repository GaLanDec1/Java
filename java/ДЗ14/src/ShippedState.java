// ShippedState представляет состояние "Заказ отправлен".
// Реализация метода handle() для состояния отправки заказа.
public class ShippedState implements State {
    @Override
    public void handle() {
        // Вывод сообщения о том, что заказ был отправлен.
        System.out.println("Заказ отправлен!");
    }
}
