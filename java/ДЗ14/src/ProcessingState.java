// ProcessingState представляет состояние "Заказ в процессе обработки".
// Реализация метода handle() для состояния обработки заказа.
public class ProcessingState implements State {
    @Override
    public void handle() {
        // Вывод сообщения о том, что заказ находится в процессе обработки.
        System.out.println("Заказ в процессе обработки...");
    }
}
