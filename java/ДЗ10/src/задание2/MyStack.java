package Задание_2;
import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {

    public void push(Object o) {
        add(o);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return remove(size() - 1);
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return get(size() - 1);
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return size();
    }
}
