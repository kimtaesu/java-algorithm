package structure;

import java.nio.BufferUnderflowException;


interface StackInterface {
    void push(int item);
    int pop();
}

public class MyStack implements StackInterface {
    int top;
    int size;
    int[] stack;

    public MyStack(int size) {
        this.top = 0;
        this.size = size;
        stack = new int[size];
    }

    public void push(int item) {
        if (top >= size) {
            throw new RuntimeException("Stack over flow");
        }

        stack[top++] = item;
    }

    public int pop() {
        if (top < 0) {
            throw new RuntimeException("Stack under flow");
        }
        return stack[top--];
    }
}
