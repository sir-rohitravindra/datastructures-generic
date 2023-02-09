package MiscJava.DataStructures.LinkedList;

public class Node<T> {

    private T value;
    private Node<T> nextNode;

    public Node(T value) {
        this.value = value;
        this.nextNode = null;
    }

    public T getNodeValue() {
        return this.value;
    }

    public Node<T> getNextNode() {
        return this.nextNode;
    }

    public void setNodeValue(T newValue) {
        this.value = newValue;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

}
