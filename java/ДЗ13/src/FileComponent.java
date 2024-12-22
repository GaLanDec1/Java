// Интерфейс FileComponent представляет общий интерфейс для всех компонентов (файлов и директорий).
interface FileComponent {
    void add(FileComponent component); // Добавление компонента в коллекцию.
    void remove(FileComponent component); // Удаление компонента из коллекции.
    void display(int indentation); // Отображение структуры с отступами.
}