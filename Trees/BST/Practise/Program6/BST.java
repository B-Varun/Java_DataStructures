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
if(root == null)
	return null;
else if(root.data > data)
	root.left = delete(root.left, data);
else if(root.data < data)
	root.right = delete(root.right, data);
else{
	if(root.left == null && root.right == null)
		return null;
	else if(root.left == null)
		return root.right;
	else if(root.right == null)
		return root.left;
	else {
		int rootVal = inOrderSuccessor(root);
		if(root.data > rootVal)
		     root.left = delete(root.left, rootVal);
		else if(root.data < rootVal)
		     root.right = delete(root.right, rootVal);
		root.data = rootVal;
	}
}
return root;
}

public int inOrderSuccessor(Node root){
if(root.right == null)
	return nearestAncestor(root);
else
	return successor(root.right);
}

public int nearestAncestor(Node curr){
Node successor = null, temp = rootP;

while(temp!=curr){
if(temp.data > curr.data){
	successor = temp;
	temp = temp.left;
}
else	
	temp = temp.right;
}
return successor.data;
}

public int successor(Node root){
 if(root == null)
	return -1;
 else if(root.left == null)
	return root.data;
 else 
	return successor(root.left);
}

public boolean isEmpty(){
 return (rootP == null) ? true : false;
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