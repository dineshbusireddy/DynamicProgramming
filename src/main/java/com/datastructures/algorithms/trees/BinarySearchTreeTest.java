package com.datastructures.algorithms.trees;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(52, 33, 65, 25, 39, 60, 78, 12, 10, 27, 28, 34, 48, 72, 90);
        System.out.println(tree);
        System.out.println("PreOrder: " + tree.toStringPreOrder());
        System.out.println("PostOrder: " + tree.toStringPostOrder());
        System.out.println("Find 52 : " + tree.find(52));
        System.out.println("Find 33 : " + tree.find(33));
        System.out.println("Find 132 : " + tree.find(132));

        System.out.println("Delete leaf");
        tree = new BinarySearchTree();
        tree.insert(52, 33, 65, 25, 39, 60, 78, 12, 10, 27, 28, 34, 48, 72, 90);
        System.out.println(tree);
        tree.delete(10);
        tree.delete(28);
        System.out.println(tree);


        System.out.println("Delete node contains single child");
        tree = new BinarySearchTree();
        tree.insert(52, 33, 65, 25, 39, 60, 78, 12, 10, 27, 28, 34, 48, 72, 90);
        System.out.println(tree);
        tree.delete(12);
        tree.delete(27);
        System.out.println(tree);



        System.out.println("Delete node contains subtree");
        tree = new BinarySearchTree();
        tree.insert(52, 33, 65, 25, 39, 60, 78, 12, 10, 27, 28, 34, 48, 72, 90);
        System.out.println(tree);
        tree.delete(33);
        tree.delete(65);
        System.out.println(tree);


        System.out.println("Successor has right child");
        tree = new BinarySearchTree();
        tree.insert(52, 33, 65, 25, 39, 60, 78, 12, 10, 27, 28, 34, 48, 72, 90, 36);
        System.out.println(tree);
        tree.delete(33);
        System.out.println(tree);


        System.out.println("delete root itself leaf");
        tree = new BinarySearchTree();
        tree.insert(52);
        System.out.println(tree);
        tree.delete(52);
        System.out.println(tree);

        System.out.println("delete root contains single child");
        tree = new BinarySearchTree();
        tree.insert(52, 33);
        System.out.println(tree);
        tree.delete(52);
        System.out.println(tree);

        System.out.println("delete root contains subtree");
        tree = new BinarySearchTree();
        tree.insert(52, 33, 65, 25, 39, 60, 78, 12, 10, 27, 28, 34, 48, 72, 90);
        System.out.println(tree);
        tree.delete(52);
        System.out.println(tree);


        System.out.println("soft delete");
        tree = new BinarySearchTree();
        tree.insert(52, 33, 65, 25, 39, 60, 78, 12, 10, 27, 28, 34, 48, 72, 90);
        System.out.println(tree);
        tree.softDelete(52);
        System.out.println(tree);
    }
}
