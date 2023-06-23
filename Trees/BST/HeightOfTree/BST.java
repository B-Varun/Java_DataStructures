package com.java.learn.ds.tree.bst;

class Node{
int data;
Node left, right;

public Node(int d){
 this.data = d;
 this.left = this.right = null;
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

public int rootVal(){
 return (isEmpty()) ? -1 : rootPtr.data;
}

public static int height(Node root){
 if(root == null) 
	return -1;
 else
	return max(height(root.left), height(root.right))+1;
}

public static int max(int a, int b){
 return (a>b) ? a : b;
}

}