package com.java.learn.ds.tree.bst;

class Node{
 int data;
 Node left, right;

public Node(int d){
 data = d;
 left = right = null;
} 
}

public class BST{
Node rootPtr = null;

public Node insert(Node root, Node newNode){
 if(root == null)
	root = newNode;
 else if(root.data >= newNode.data)
	root.left = insert(root.left, newNode);
 else 
	root.right = insert(root.right, newNode);
 return root;
}

public boolean isEmpty(){
 return (rootPtr == null) ? true : false;
}

public static int depth(Node root, int n){
 if(root == null) 
	return -1;
 else if(root.data == n)
	return 0;
 else if(root.data >= n)
	return 1+depth(root.left, n);
 else 
	return 1+depth(root.right, n);
}

}