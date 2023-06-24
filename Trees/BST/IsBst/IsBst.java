package com.java.learn.ds.tree.bst.isbst;

import com.java.learn.ds.node.Node;
import com.java.learn.ds.tree.bst.BST;

public class IsBst{

public static void main(String... tre){
 BST bst = new BST();
 int[] arr = new int[]{1, 2, 3};

 for(int i=0; i<arr.length; i++)
    bst.rootPtr = bst.insert(bst.rootPtr, new Node(arr[i]));
 
 System.out.println("Inorder of the BST is :");
 inOrder(bst.rootPtr);

 System.out.println("\n\nPreorder of the BST is :");
 preOrder(bst.rootPtr);

 System.out.println("\n\nPostorder of the BST is :");
 postOrder(bst.rootPtr);

 System.out.println("\n\nIs the above tree a BST : "+isBST(bst.rootPtr));
 
}

public static void inOrder(Node root){
 if(root == null)
	return;
 else{
	inOrder(root.left);
	System.out.print(root.data+"\t");
	inOrder(root.right);
 }
}

public static void preOrder(Node root){
 if(root == null)
	return;
 else{
	System.out.print(root.data+"\t");
	preOrder(root.left);
	preOrder(root.right);
 }
}

public static void postOrder(Node root){
 if(root == null)
	return;
 else{
	postOrder(root.left);
	postOrder(root.right);
	System.out.print(root.data+"\t");
 }
}

public static boolean isBST(Node root){
 if((root == null) || (root.left == null && root.right == null))
	return true;
 else if(root.left == null && root.right != null){
	if(root.data < root.right.data)
		return isBST(root.right);
 }
 else if(root.left != null && root.right == null){
	if(root.data >= root.left.data)
		return isBST(root.left);
 }
 else if((root.data >= root.left.data) && (root.data < root.right.data))
	return isBST(root.left) && isBST(root.right);
 
 return false; 
}

}