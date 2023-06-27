package com.java.learn.ds.tree.bst;

import com.java.learn.ds.node.Node;

public class BST{

public Node rootPtr = null;

public static Node insert(Node root, Node node){
 if(root == null)
	root = node;
 else if(root.data >= node.data)
	root.left = insert(root.left, node);
 else 
	root.right = insert(root.right, node);
 return root;
}

public Node deleteLeafNode(Node root, int data){
 if((root == null) || (root.data == data))
	return null;
 else if(root.data > data)
	root.left = deleteLeafNode(root.left, data);
 else
	root.right = deleteLeafNode(root.right, data);
 return root; 
}

public boolean isEmpty(){
 return (rootPtr == null) ? true : false;
}

}