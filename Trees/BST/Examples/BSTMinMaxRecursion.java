package com.java.learn.ds.trees.bst;

class Node{
int data;
Node left, right;

public Node(int d){
 this.data = d;
 this.left = this.right = null;
}
}

public class BSTMinMaxRecursion{

public Node rootPtr = null;

public Node getRootNode(){
 return rootPtr;
}

public Node insert(Node root, Node newNode){
 if(isEmpty(root))
	root = newNode;
 else if(newNode.data <= root.data)
	root.left = insert(root.left, newNode); 
 else
	root.right = insert(root.right, newNode);
 return root;
}

public boolean isEmpty(Node root){
 return (root == null) ? true : false;
}

public boolean search(Node root, int d){
 if(root == null)
	return false;
 else if(root.data == d)
	return true;
 else if(root.data >= d)
	return search(root.left, d);
 else
	return search(root.right, d); 
}

public int findMin(Node root){
 if(root == null)
	return -1;
 else if(root.left == null)
	return root.data;
 else 
	return findMin(root.left);
}

public int findMax(Node root){
 if(root == null)
	return -1;
 else if(root.right == null)
	return root.data;
 else 
	return findMax(root.right);
}

}