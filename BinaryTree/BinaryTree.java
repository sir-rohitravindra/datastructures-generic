package MiscJava.DataStructures.BinaryTree;

import MiscJava.DataStructures.Exceptions.LinkedListException;
import MiscJava.DataStructures.LinkedList.LinkedList;
import MiscJava.DataStructures.Queue.Queue;
import MiscJava.DataStructures.TreeUtils.TreeNode;

public class BinaryTree<T> {

    private TreeNode<T> head;

    // public BinaryTree() {
    // head = new TreeNode<T>();
    // }

    // public TreeNode<T> BFS_BinaryTree_Build(LinkedList<String> BFS_Tree_List) {

    // if (BFS_Tree_List.getLength() == 1) {

    // try {
    // head = (TreeNode<T>) new TreeNode<String>(BFS_Tree_List.get(0));
    // } catch (LinkedListException e) {
    // e.printStackTrace();
    // }

    // } else if (BFS_Tree_List.getLength() > 1) {

    // Queue<TreeNode<T>> queue = new Queue<TreeNode<T>>();

    // TreeNode<T> curTreeNode = head;
    // queue.add(curTreeNode);

    // for (int i = 0; i < BFS_Tree_List.getLength(); i++) {

    // curTreeNode = queue.front();
    // queue.dequeue();
    // if (!BFS_Tree_List.get(i).equals("*")) {
    // curTreeNode.setValue((T) BFS_Tree_List.get(i));
    // }

    // }

    // }
    // return head;

    // }

}

// BFS implementation
// ....1
// ..2.. 3
// .4 5 6 7

// [1,2,3,4,5,6,7]

// 1
// 2 3
// 4 5 - 7

// [1,2,3,4,5,-,7]
