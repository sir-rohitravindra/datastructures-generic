package MiscJava.DataStructures.BinarySearchTree;

import MiscJava.DataStructures.Exceptions.DuplicateValueException;

public class App {

    public static void main(String[] args) {

        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();

        try {
            binarySearchTree.insert(10);
            binarySearchTree.insert(5);
            binarySearchTree.insert(4);
            binarySearchTree.insert(6);
        } catch (DuplicateValueException e) {
            e.printStackTrace();
        }

        // System.out.println(binarySearchTree.inorder());
        // System.out.println(binarySearchTree.root.getValue());
        // System.out.println(binarySearchTree.root.getLeftChild().getValue());
        // System.out.println(binarySearchTree.root.getLeftChild().getLeftChild().getValue());
        // System.out.println(binarySearchTree.root.getLeftChild().getRightChild().getValue());

        System.out.println(binarySearchTree.inorderV2());

    }

}
