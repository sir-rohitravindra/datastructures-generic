package MiscJava.DataStructures.Stack;

import MiscJava.DataStructures.LinkedList.LinkedList;
import MiscJava.DataStructures.Exceptions.UnderflowException;

public class Stack<T> {

    private LinkedList<T> linkedList;

    public Stack() {
        linkedList = new LinkedList<T>();
    }

    public void push(T value) {
        linkedList.insert(value);
    }

    public int length() {
        return linkedList.getLength();
    }

    public T peek() throws Exception {

        if (this.length() < 1) {
            throw new Exception("Stack Underflow!");

        }
        int curSize = this.length();
        return linkedList.get(curSize - 1);

    }

    public void pop() throws UnderflowException {
        try {
            linkedList.deleteEnd();
        } catch (Exception ue) {
            throw new UnderflowException("Stack Underflow");
        }
    }

    public boolean isEmpty() {
        return this.length() == 0;
    }

}
