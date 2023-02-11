package MiscJava.DataStructures.TreeUtils;

import java.util.Objects;

import MiscJava.DataStructures.LinkedList.LinkedList;

public class Traversals<T> {

    public LinkedList<T> inorder(TreeNode<T> root) {

        LinkedList<T> inorderList = new LinkedList<>();

        inorder_implementation(root, inorderList);
        return inorderList;

    }

    private void inorder_implementation(TreeNode<T> root, LinkedList<T> inorderList) {

        if (Objects.nonNull(root)) {
            inorder_implementation(root.getLeftChild(), inorderList);
            inorderList.insert(root.getValue());
            inorder_implementation(root.getRightChild(), inorderList);
        }
    }

}
