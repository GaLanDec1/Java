// Основной класс для демонстрации работы файловой системы с использованием паттерна Composite.
public class FileSystemDemo {
    public static void main(String[] args) {
        // Создание корневой директории и вложенных папок/файлов.
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory user = new Directory("user");
        File file1 = new File("file1.txt");
        File file2 = new File("file2.doc");

        // Формирование иерархии.
        root.add(home);
        home.add(user);
        user.add(file1);
        root.add(file2);

        // Отображение всей файловой структуры.
        root.display(0);
    }
}