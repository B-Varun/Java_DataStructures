package com.java.learn.ds.trees.bst;

public class BinarySearchTree{

public Node rootPtr = null;

public void insert(int data){
 Node newNode = new Node(data);
 rootPtr = insertNode(rootPtr, newNode);
}

public Node insertNode(Node root, Node newNode){
 if(root == null){
	root = newNode;
 }
 else if(root.data >= newNode.data)
	root.left = insertNode(root.left, newNode);
 else
	root.right = insertNode(root.right, newNode);
 return root;
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

public boolean search(int data){
return searchTree(rootPtr, data);
}

public boolean searchTree(Node root, int data){
 if(root == null)
	return false;
 else if(root.data == data)
	return true;
 else if(root.data > data)
	return searchTree(root.left, data);
 else
	return searchTree(root.right, data);
}

public int findMin(){
 if(rootPtr == null)
	return -1;
 Node temp = rootPtr;
 while(temp.left != null)
	temp = temp.left;
 return temp.data;
}

public int findMax(){
 if(rootPtr == null)
	return -1;
 Node temp = rootPtr;
 while(temp.right != null)
	temp = temp.right;
 return temp.data;
}


}