package com.java.learn.ds.tree.bst;

import com.java.learn.ds.node.BSTNode;

public class BinarySearchTree{

public BSTNode rootPtr;

public BSTNode insert(BSTNode root, BSTNode node){
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
