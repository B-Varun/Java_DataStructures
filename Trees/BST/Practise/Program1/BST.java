package com.java.practise.ds.tree.bst;

import com.java.practise.ds.node.Node;

public class BST{
public Node rootPtr = null;
public boolean isDelete = false;

public Node insert(Node root, Node node){
 if(root == null) 
	root = node;
 else if(root.data >= node.data)
	root.left = insert(root.left, node);
 else
	root.right = insert(root.right, node);
 return root;
}

public boolean isLeaf(Node root){
 return (root.left == null && root.right == null) ? true : false;
}

public Node delete(Node root, int data){
 if((root == null) || (isLeaf(root) && root.data == data))
	return null;
 else if(root.data > data)
	root.left = delete(root.left, data);
 else if(root.data < data)
	root.right = delete(root.right, data);
 else{
	if(root.right == null)
		return root.left;
	else if(root.left == null)
		return root.right;
	else{
		isDelete = true;
		return inOrderSuccessor(root,data);
	}
 }	
 return root;
}

public boolean isEmpty(){
 return (rootPtr == null) ? true : false;
}

// To find a min value in a subtree the root is being passed.
public static int findMin(Node root){
 return (root.left == null) ? root.data : findMin(root.left);
}

public int findMax(Node root){
 return (root.right == null) ? root.data : findMax(root.right);
}

public boolean search(int data){
 return find(rootPtr, data);
}

public boolean find(Node root, int data){
 if(root == null)
	return false;
 else if(root.data > data)
	return find(root.left, data);
 else if(root.data < data)
	return find(root.right, data);
 else
	return true;
}

public Node inOrderSuccessor(Node root, int data){
 if(root == null)
	return null;
 else if(root.data > data)
	root.left = inOrderSuccessor(root.left, data);
 else if(root.data < data)
	root.right = inOrderSuccessor(root.right, data);
 else{
	if(root.right != null)
		return successor(root.right);
	else
		return nearestAncestor(rootPtr, root);
 }
 return root;
}

public Node nearestAncestor(Node root, Node curr){
  Node temp = root; 
  Node successor = null;
 
 while(temp!=curr){
	if(temp.data > curr.data){
		successor = temp;
		temp = temp.left;
	}
	else if(temp.data < curr.data)
		temp = temp.right;		
 }
 return successor;
}

public Node successor(Node root){
 if(root.left == null)
	return root;
 else
	return successor(root.left);
}

/*public int inOrderPredecessor(){

}
*/
}