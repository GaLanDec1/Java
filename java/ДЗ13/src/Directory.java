import java.util.ArrayList;
import java.util.List;

class Directory implements FileComponent {
    private String name; // Название директории.
    private List<FileComponent> components = new ArrayList<>(); // Список дочерних компонентов.

    public Directory(String name) {
        this.name = name; // Инициализация имени папки.
    }

    @Override
    public void add(FileComponent component) {
        components.add(component); // Добавление компонента в список.
    }

    @Override
    public void remove(FileComponent component) {
        components.remove(component); // Удаление компонента из списка.
    }

    @Override
    public void display(int indentation) {
        // Отображение директории с соответствующими отступами.
        System.out.println(" ".repeat(indentation) + "+ Directory: " + name);
        for (FileComponent component : components) {
            component.display(indentation + 2); // Рекурсивное отображение вложенных компонентов.
        }
    }
}