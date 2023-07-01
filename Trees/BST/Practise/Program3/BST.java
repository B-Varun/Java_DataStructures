package com.java.practise.ds.tree.bst;
import com.java.practise.ds.node.Node;

public class BST{
public Node rootP = null;
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
if((root == null) || (root.right == null && root.left == null))
	return null;
else if(root.data < data)
	root.right = delete(root.right, data);
else if(root.data > data)
	root.left = delete(root.left, data);
else{
	// Has right child
	if(root.left == null)
		return root.right;
	// Has left child
	else if(root.right == null)
		return root.left;
	// Has both children
	else{
		int successor = inOrderSuccessor(root.right);
		root.data = successor;
		root.right = deleteSuccessor(root.right, successor);
	}
}
return root;
}

public Node deleteSuccessor(Node root, int data){
 if((root == null) || (root.data == data))
	return null;
 else
	root.left = deleteSuccessor(root.left, data);	
return root;
}

public int inOrderSuccessor(Node root){
if(root == null)
	return -1;
else if(root.left == null)
	return root.data;
else
	return inOrderSuccessor(root.left);
}

public boolean isEmpty(){
 return (rootP == null) ? true : false;
}

public int rootVal(){
 return isEmpty() ? -1 : rootP.data;
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