package com.java.learn.ds.trees.bst;

public class BSTMinMaxRecursionDemo1{

public static void main(String... args){
BSTMinMaxRecursion bst = new BSTMinMaxRecursion();
bst.rootPtr = bst.insert(bst.getRootNode(), new Node(10));
bst.rootPtr = bst.insert(bst.getRootNode(), new Node(100));
bst.rootPtr = bst.insert(bst.getRootNode(), new Node(0));
bst.rootPtr = bst.insert(bst.getRootNode(), new Node(90));
bst.rootPtr = bst.insert(bst.getRootNode(), new Node(1));
bst.rootPtr = bst.insert(bst.getRootNode(), new Node(9));

System.out.println("Max element is : "+bst.findMax(bst.getRootNode()));
System.out.println("Min element is : "+bst.findMin(bst.getRootNode()));
}

}