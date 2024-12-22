public class GenericStack<E> {
    private E[] elements;
    private int size = 0;
    private static final int INITIAL_CAPACITY = 10;

    public GenericStack() {
        elements = (E[]) new Object[INITIAL_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public void push(E value) {
        if (size >= elements.length) {
            expandCapacity();
        }
        elements[size++] = value;
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E topElement = elements[--size];
        elements[size] = null;
        return topElement;
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return elements[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void expandCapacity() {
        E[] largerArray = (E[]) new Object[elements.length * 2];
        System.arraycopy(elements, 0, largerArray, 0, elements.length);
        elements = largerArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("стек: [");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
