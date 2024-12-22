import java.util.ArrayList;

public class ArrayStack<E> extends ArrayList<E> {

    public ArrayStack() {
        super();
    }

    public int getSize() {
        return size();
    }

    public E peek() {
        return get(getSize() - 1);
    }

    public E pop() {
        return remove(getSize() - 1);
    }

    public void push(E o) {
        add(o);
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public String toString() {
        return "стек: " + super.toString();
    }
}
