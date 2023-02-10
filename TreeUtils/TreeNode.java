package MiscJava.DataStructures.TreeUtils;

public class TreeNode<T> {

    /**
     * Generic Tree - Node implementation
     * Binary Tree
     * ->2 children
     * -> Left Child
     * 
     * -> Right Child
     * 
     * @Author Rohit Ravindra
     **/

    private T value;
    TreeNode<T> leftChild;
    TreeNode<T> rightChild;

    public TreeNode(T value, TreeNode<T> leftTreeNode, TreeNode<T> rightTreeNode) {
        this.value = value;
        this.leftChild = leftTreeNode;
        this.rightChild = rightTreeNode;
    }

    public TreeNode(T value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    // public TreeNode() {
    // this.value = null;
    // this.leftChild = null;
    // this.rightChild = null;
    // }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public TreeNode<T> getLeftChild() {
        return this.leftChild;
    }

    public void setLeftChild(TreeNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode<T> getRightChild() {
        return this.rightChild;
    }

    public void setRightChild(TreeNode<T> rightChild) {
        this.rightChild = rightChild;
    }

}
