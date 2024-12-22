package Задание_3;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Object> stackList;

    public MyStack() {
        stackList = new ArrayList<>();
    }

    public void push(Object o) {
        stackList.add(o);
    }

    public Object pop() {
        if (stackList.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackList.remove(stackList.size() - 1);
    }

    public Object peek() {
        if (stackList.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackList.get(stackList.size() - 1);
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public int getSize() {
        return stackList.size();
    }

    // Метод для глубокой копии
    public MyStack deepCopy() {
        MyStack newStack = new MyStack();
        for (Object item : this.stackList) {
            newStack.push(item);  // копируем элементы
        }
        return newStack;
    }
}
