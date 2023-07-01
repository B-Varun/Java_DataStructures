package com.java.practise.ds.tree.bst;
import com.java.practise.ds.node.Node;

public class BST{
public Node rootP = null;

public Node createNode(int data){
 return new Node(data);
}

public Node insert(Node root, int data){
if(root == null)
	return createNode(data);
else if(root.data >= data)
	root.left = insert(root.left, data);
else 
	root.right = insert(root.right, data);
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
	if(root.right == null)
		return root.left;
	else if(root.left == null)
		return root.right;
	else{
		int rootData = inOrderSuccessor(root);
		if(root.data > rootData)
			root.left = delete(root.left, rootData);
		else
			root.right = delete(root.right, rootData);
		root.data = rootData;
	}
}
return root;
}

public int inOrderSuccessor(Node root){
if(root == null)
	return -1;
else if(root.right == null)
	return nearestAncestor(rootP, root);
else
	return successor(root.right);
}

public int successor(Node root){
if(root.left == null)
	return root.data;
else
	return successor(root.left);
}

public int nearestAncestor(Node root, Node curr){
Node successor = null, temp = root;

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

public boolean isEmpty(){
 return (rootP == null) ? true : false;
}

}