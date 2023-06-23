package com.java.learn.ds.trees.bst;

public class BSTDemo{

public static void main(String... ards){

BinarySearchTree bst = new BinarySearchTree();
bst.insert(10);
bst.insert(2);
bst.insert(20);
bst.insert(5);
bst.insert(15);
bst.insert(100);
System.out.println("Tree contains 0 : "+bst.search(0));
System.out.println("Tree contains 15 : "+bst.search(15));
System.out.println("Tree contains 105 : "+bst.search(105));
System.out.println("Tree contains 100 : "+bst.search(100));
System.out.println("Tree contains 20 : "+bst.search(20));

System.out.println("\n\nMax element in the BST is : "+bst.findMax());
System.out.println("\nMin element in the BST is : "+bst.findMin());

}

}