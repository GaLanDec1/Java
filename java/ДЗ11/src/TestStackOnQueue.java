public class TestStackOnQueue {
    public static void main(String[] args) {
        // Создаем новый экземпляр стека
        StackOnQueue stack = new StackOnQueue();

        // Добавляем два значения
        stack.push(40);
        stack.push(20);
        stack.push(30);
        // Выводим объект на вершине стека (без удаления)
        System.out.println("Верхний элемент стека (без удаления): " + stack.top());

        // Выводим и удаляем объект на вершине стека
        System.out.println("Верхний элемент стека (с удалением): " + stack.pop());

        // Проверка стека на пустоту
        System.out.println("Стек пуст: " + stack.empty());

        // Вывод информации о всех элементах стека
        System.out.println("Все элементы стека: " + stack.toString());
    }
}
