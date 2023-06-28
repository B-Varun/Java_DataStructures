package com.java.learn.ds.tree.bst.inorder;

import com.java.learn.ds.node.Node;
public class BST{
public Node rootPtr = null;
public Node insert(Node root, Node node){
if(root == null)
	root = node;
else if(root.data >= node.data)
	root.left = insert(root.left, node);
else
	root.right = insert(root.right, node);
return root;
}
}