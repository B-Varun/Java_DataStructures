package com.java.practise.ds.tree.bst;

import com.java.practise.ds.node.Node;

public class BST{
public Node rootPtr = null;

public Node insert(Node root, Node node){
 if(root == null)
	root = node;
 else if(root.data >= node.data)
	root.left = insert(root.left, node);
 else 
	root.right = insert(root.right, node);
 return root; 
}

public Node delete(Node root, int data){
 if((root == null) && (root.left == null && root.right == null && root.data == data))
	return null;
 else if(root.data > data)
	root.left = delete(root.left, data);
 else if(root.data < data)
	root.right = delete(root.right, data);
 else{
	if(root.left == null)
		return root.right;
	else if(root.right == null)
		return root.left;
	else
		return inOrderSuccessor(root.right);	
 }
 return root;	
}

public boolean isEmpty(){
 return (rootPtr == null) ? true : false;
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

// Only for delete. For few cases its not going to work
public Node inOrderSuccessor(Node root){
 if(root.left == null)
	return root;
 return inOrderSuccessor(root.left);
}

}