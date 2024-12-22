import java.util.LinkedList;
import java.util.Queue;

public class StackOnQueue {
    private Queue<Integer> queue1 = new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();

    // Метод для добавления элемента в стек
    public void push(int x) {
        queue1.add(x);
    }

    // Метод для удаления верхнего элемента стека
    public int pop() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Стек пуст.");
        }

        // Перемещение элементов из queue1 в queue2, оставляя последний элемент
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }

        // Последний элемент queue1 — это верхушка стека
        int topElement = queue1.poll();

        // Меняем местами queue1 и queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    // Метод для получения верхнего элемента стека без удаления
    public int top() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Стек пуст.");
        }

        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }

        int topElement = queue1.poll();
        queue2.add(topElement);

        // Меняем местами queue1 и queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    // Метод проверки на пустоту стека
    public boolean empty() {
        return queue1.isEmpty();
    }

    // Метод, возвращающий строковое представление всех элементов стека
    @Override
    public String toString() {
        return queue1.toString();
    }
}
