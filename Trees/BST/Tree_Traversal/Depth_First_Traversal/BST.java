package com.java.learn.ds.tree.bst;

import com.java.learn.ds.node.Node;
import com.java.learn.ds.stack.Stack;

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

public boolean isEmpty(){
 return (rootPtr == null) ? true : false;
}

public int rootVal(){
 return isEmpty() ? -1 : rootPtr.data;
}

}