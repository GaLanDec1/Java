// NewOrderState представляет состояние "Новый заказ".
// Реализация метода handle() для этого состояния.
public class NewOrderState implements State {
    @Override
    public void handle() {
        // Обработка нового заказа: вывод сообщения о начале процесса обработки нового заказа.
        System.out.println("Обработка нового заказа...");
    }
}
