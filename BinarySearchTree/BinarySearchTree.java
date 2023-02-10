package MiscJava.DataStructures.BinarySearchTree;

import java.util.Objects;

import MiscJava.DataStructures.Exceptions.DuplicateValueException;
import MiscJava.DataStructures.TreeUtils.TreeNode;

import MiscJava.DataStructures.Stack.Stack;
import MiscJava.DataStructures.LinkedList.LinkedList;

public class BinarySearchTree<T extends Comparable<T>> {

    private TreeNode<T> root;

    public BinarySearchTree() {
        root = null;
    }

    public TreeNode<T> insert(T value) throws DuplicateValueException {
        if (Objects.isNull(root)) {
            root = new TreeNode<T>(value);
        } else {

            TreeNode<T> curTreeNode = root;
            TreeNode<T> prevTreeNode = null;
            while (Objects.nonNull(curTreeNode)) {
                if (value.compareTo(curTreeNode.getValue()) > 0) {
                    prevTreeNode = curTreeNode;
                    curTreeNode = curTreeNode.getLeftChild();

                } else if (value.compareTo(curTreeNode.getValue()) < 0) {
                    prevTreeNode = curTreeNode;
                    curTreeNode = curTreeNode.getRightChild();
                } else {
                    throw new DuplicateValueException("Duplicate Value! Value: " + value + " exists in BST!");

                }
            }

            if (Objects.nonNull(prevTreeNode)) {
                if (value.compareTo(prevTreeNode.getValue()) > 0) {
                    prevTreeNode.setRightChild(new TreeNode<T>(value));
                } else {
                    prevTreeNode.setLeftChild(new TreeNode<T>(value));
                }

            }

        }
        return root;
    }

    public LinkedList<T> inorder() {

        LinkedList<T> inorderList = new LinkedList<>();

        if (Objects.nonNull(root)) {
            Stack<TreeNode<T>> stack = new Stack<>();

            TreeNode<T> curTreeNode;
            stack.push(root);
            try {
                while (!stack.isEmpty()) {
                    if (Objects.isNull(stack.peek().getLeftChild())) {
                        curTreeNode = stack.peek();
                        inorderList.insert(curTreeNode.getValue());
                        stack.pop();
                        if (Objects.nonNull(curTreeNode.getRightChild())) {
                            stack.push(curTreeNode.getRightChild());
                        }
                    } else {
                        stack.push(stack.peek().getLeftChild());
                    }
                }

            } catch (Exception e) {

            }

        }
        return inorderList;
    }

}
