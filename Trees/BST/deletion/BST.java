package com.java.learn.ds.tree.bst;

import com.java.learn.ds.node.Node;

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
 if((root == null) || ((root.left == null) && (root.right == null) && (root.data == data)))
	return null;
 else if(root.data > data)
	root.left = delete(root.left, data);
 else if(root.data < data)
	root.right = delete(root.right, data);
 else{ 	// root.data == data
	if(root.left == null)
		return root.right;
	else if(root.right == null)
		return root.left;
	else
	return null; // return inOrderPredecessor or InorderSucessor();
 }
return root;
}

public boolean isEmpty(){
 return (rootPtr == null) ? true : false;
}

}