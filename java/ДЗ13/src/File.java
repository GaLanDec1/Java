// File представляет отдельный файл. В отличие от Directory, файл не может содержать других компонентов.
class File implements FileComponent {
    private String name; // Имя файла.

    public File(String name) {
        this.name = name; // Инициализация имени файла.
    }

    @Override
    public void add(FileComponent component) {
        // Операция не поддерживается, так как файл не может содержать вложенные элементы.
        throw new UnsupportedOperationException("Нельзя добавить компонент в файл.");
    }

    @Override
    public void remove(FileComponent component) {
        // Операция не поддерживается, так как файл не может содержать вложенные элементы.
        throw new UnsupportedOperationException("Нельзя удалить компонент из файла.");
    }

    @Override
    public void display(int indentation) {
        // Отображение файла с отступами.
        System.out.println(" ".repeat(indentation) + "- File: " + name);
    }
}