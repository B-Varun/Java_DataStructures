package com.java.learn.ds.tree.bst.isbst;

import com.java.learn.ds.tree.bst.BinarySearchTree;
import com.java.learn.ds.node.BSTNode;

public class IsBSTRec{
public static void main(String... args){
BinarySearchTree bst = new BinarySearchTree();
int[] arr = new int[]{100,50,200,40,70,275,300};

for(int i=0; i<arr.length; i++)
    bst.rootPtr = bst.insert(bst.rootPtr, new BSTNode(arr[i]));

System.out.println("The above tree is a BST : "+isBST(bst.rootPtr));

}

public static boolean isBST(BSTNode root){
 if(root == null)
	return true;
 else 
	return isLeftSubTreeLess(root.left, root.data) && isRightSubTreeGreat(root.right, root.data); 
}

public static boolean isLeftSubTreeLess(BSTNode root, int data){
 if(root == null)
	return true;
 else if(root.data > data) 
	return false;
 else
	return isLeftSubTreeLess(root.left, root.data) && isRightSubTreeGreat(root.right, root.data);
}

public static boolean isRightSubTreeGreat(BSTNode root, int data){
 if(root == null)
	return true;
 else if(root.data <= data)
	return false;
 else
	return isLeftSubTreeLess(root.left, root.data) && isRightSubTreeGreat(root.right, root.data);
}

}