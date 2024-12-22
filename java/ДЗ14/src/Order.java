// Order представляет заказ, который может находиться в различных состояниях.
// Управляет текущим состоянием заказа и позволяет менять его.
public class Order {
    private State currentState; // Текущее состояние заказа.

    // Конструктор принимает начальное состояние заказа.
    public Order(State initialState) {
        this.currentState = initialState;
    }

    // Метод для установки нового состояния заказа.
    public void setState(State state) {
        this.currentState = state;
    }

    // Метод для обработки заказа в текущем состоянии.
    public void processOrder() {
        currentState.handle(); // Вызов метода handle() текущего состояния.
    }
}
