package MiscJava.DataStructures.LinkedList;

import java.util.Objects;

import MiscJava.DataStructures.Exceptions.LinkedListException;

public class LinkedList<T> {

    private Node<T> headNode;
    private int length;
    private Node<T> tailNode;

    public LinkedList() {
        headNode = null;
        tailNode = null;
        length = 0;
    }

    public void insert(T value) {
        if (headNode == null) {
            headNode = new Node<T>(value);
            tailNode = headNode;

        } else {
            tailNode.setNextNode(new Node<T>(value));
            tailNode = tailNode.getNextNode();
        }
        length++;
    }

    public int getLength() {
        return length;
    }

    public void deleteEnd() throws Exception {
        if (!Objects.isNull(headNode)) {
            if (tailNode.equals(headNode)) {
                tailNode = null;
                headNode = null;

            } else {
                Node<T> curNode = headNode;
                while (!curNode.getNextNode().equals(tailNode)) {
                    // System.out.println("CUrnode" + curNode.getNodeValue());
                    curNode = curNode.getNextNode();
                }
                curNode.setNextNode(null);

                tailNode = curNode;
            }
            length--;
        } else {
            throw new Exception("Linkedlist Empty!");
        }
    }

    public void deleteFront() throws LinkedListException {
        if (!Objects.isNull(headNode)) {
            if (tailNode.equals(headNode)) {
                headNode = null;
                tailNode = null;
            } else {
                headNode = headNode.getNextNode();
            }

            length--;

        } else {
            throw new LinkedListException("Linked List Empty!");
        }
    }

    public T get(int index) throws LinkedListException {
        if (index >= length || index < 0 || (index == 0 && length == 0)) {
            throw new LinkedListException("Index out of range: " + index);

        }

        else {
            Node<T> curNode = headNode;
            int curIndex = 0;
            while (curIndex != index) {
                curNode = curNode.getNextNode();
                curIndex++;
            }
            return curNode.getNodeValue();

        }
    }

    public void set(int index, T value) throws Exception {
        if (index >= length || index < 0) {
            throw new Exception("Index out of range: " + index);
        }

        else {
            Node<T> curNode = headNode;
            int curIndex = 0;
            while (curIndex != index) {
                curNode = curNode.getNextNode();
                curIndex++;
            }
            curNode.setNodeValue(value);

        }
    }

    @Override
    public String toString() {
        String displayString = "";
        Node<T> curNode = headNode;
        while (!Objects.isNull(curNode)) {
            displayString += curNode.getNodeValue() + "->";
            curNode = curNode.getNextNode();
        }

        return displayString;
    }
}
