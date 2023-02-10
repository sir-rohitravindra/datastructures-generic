package MiscJava.DataStructures.BinarySearchTree;

import java.util.Objects;

import MiscJava.DataStructures.Exceptions.DuplicateValueException;
import MiscJava.DataStructures.TreeUtils.TreeNode;

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

}
