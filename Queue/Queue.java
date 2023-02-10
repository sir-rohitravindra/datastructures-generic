package MiscJava.DataStructures.Queue;

import MiscJava.DataStructures.Exceptions.LinkedListException;
import MiscJava.DataStructures.Exceptions.UnderflowException;
import MiscJava.DataStructures.LinkedList.LinkedList;

public class Queue<T> {

    private LinkedList<T> queueList;

    public Queue() {
        queueList = new LinkedList<T>();
    }

    public void add(T value) {
        queueList.insert(value);
    }

    public T dequeue() throws UnderflowException {
        try {
            T front = queueList.get(0);
            queueList.deleteFront();
            return front;
        } catch (LinkedListException e) {
            throw new UnderflowException("Can't DeQueue Underflow!");
        }
    }

    public T front() throws UnderflowException {

        try {
            T front = queueList.get(0);
            return front;
        } catch (LinkedListException e) {
            throw new UnderflowException("Cant Peek! Queue Underflow!");
        }
    }

    public int length() {
        return queueList.getLength();
    }

}
