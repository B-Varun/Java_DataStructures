package com.java.learn.ds.tree.bst;

import com.java.learn.ds.node.Node; 

public class BST{

public Node rootPtr = null;

public static Node insert(Node root, Node node){
 if(isEmpty(root))
	root = node;
 else if(root.data >= node.data)
	root.left = insert(root.left, node);
 else
	root.right = insert(root.right, node);
 return root;	
}

public static boolean isEmpty(Node root){
 return (root == null) ? true : false;
}

}