package com.java.learn.ds.trees.bst;

public class BinarySearchTree{

public Node rootPtr = null;

public void insert(int data){
 Node newNode = new Node(data);
 insertNode(rootPtr, newNode);
}

public void insertNode(Node root, Node newNode){
 if(root == null){
	root = newNode;
	return;
 }
 else if(root.data >= newNode.data)
	insertNode(root.left, newNode);
 else
	insertNode(root.right, newNode);
} 

//public int delete(){}

public boolean isTreeEmpty(){
 return (rootPtr == null) ? true : false;
}

public int rootVal(){
 return isTreeEmpty() ? -1 : rootPtr.data;
}

/*
public void print(){
 if(isTreeEmpty()){
	System.out.println("Tree is Empty");
	return;
 }
 Node temp = rootPtr;
} 
*/


}