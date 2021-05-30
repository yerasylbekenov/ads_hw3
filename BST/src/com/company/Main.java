package com.company;

public class Main {

    public static void main(String[] args) {
        public static void main(String[] args)  {

            BST_class bst = new BST_class();

            bst.insert(55);
            bst.insert(10);
            bst.insert(7);
            bst.insert(12);
            bst.insert(90);
            bst.insert(50);

            System.out.println("The BST Created with input data(Left-root-right):");
            bst.inorder();


            System.out.println("\nThe BST after Delete 12(leaf node):");
            bst.deleteKey(10);
            bst.inorder();

            System.out.println("\nThe BST after Delete 90 (node with 1 child):");
            bst.deleteKey(90);
            bst.inorder();


            System.out.println("\nThe BST after Delete 45 (Node with 2 children):");
            bst.deleteKey(55);
            bst.inorder();

    }
}
