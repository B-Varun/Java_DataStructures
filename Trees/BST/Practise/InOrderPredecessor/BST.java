package com.java.learn.ds.tree.bst;
import com.java.learn.ds.node.Node;

public class BST{
public Node rootP = null;

public Node insert(Node root, Node ele){
if(root == null)
	root = ele;
else if(root.data >= ele.data)
	root.left = insert(root.left, ele);
else
	root.right = insert(root.right, ele);
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
	else{
//		int rootVal = inOrderSuccessor(root);
		int rootVal = inOrderPredecessor(root);
		if(root.data > rootVal)
			root.left = delete(root.left, rootVal);
		if(root.data < rootVal)
			root.right = delete(root.right, rootVal);
			root.data = rootVal;
	}
}
return root;
}

public int inOrderPredecessor(Node root){
if(root.left == null)
	return nearestAncestor(root);
else
	return predecessor(root.left);	
}

public int nearestAncestor(Node curr){
Node predecessor = null, temp = rootP;
while(temp!=curr){
 if(temp.data > curr.data)
	temp = temp.left;
 else{
	predecessor = temp;
	temp = temp.right;
 }
}
return predecessor.data;
}

public int predecessor(Node root){
if(root.right == null)
	return root.data;
else
	return predecessor(root.right);
}

public int inOrderSuccessor(Node root){
if(root.right!=null)
	return successor(root.right);
else
	return nearestAncestor(root, root.data);
}

public int nearestAncestor(Node curr, int data){
Node successor = null, temp = rootP;
while(temp != curr){
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

}