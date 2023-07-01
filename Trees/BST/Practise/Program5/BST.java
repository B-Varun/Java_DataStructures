package com.java.practise.ds.tree.bst;
import com.java.practise.ds.node.Node;
public class BST{
public Node rootP = null;
public Node insert(Node root, int d){
 if(root == null)
	root = new Node(d);
 else if(root.data > d)
	root.left = insert(root.left, d);
 else 
	root.right = insert(root.right, d);
return root;
}

public Node delete(Node root, int d){
if((root == null) && (root.left == null && root.right == null && root.data == d))
	return null;
else if(root.data > d)
	root.left = delete(root.left, d);
else if(root.data < d)
	root.right = delete(root.right, d);
else{
 if(root.left == null)
	return root.right;
 else if(root.right == null)
	return root.left;
 else{
	int rootData = inOrderSuccessor(root);
	if(root.data > rootData)
		root.left = delete(root.left, rootData);
	else if(root.data < rootData)
		root.right = delete(root.right, rootData);
		root.data = rootData;
 }
}
return root;
}

public int inOrderSuccessor(Node root){
if(root ==null)
	return -1;
else if(root.right == null)
	return anchestor(rootP, root);
else
	return successor(root.right);
}

public int anchestor(Node root, Node curr){
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

public int successor(Node root){
if(root.left == null)
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
	return findMin(root.right);
}
}