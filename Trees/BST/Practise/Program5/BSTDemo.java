package com.java.practise.ds.tree.bst.demo;

import com.java.practise.ds.node.Node;
import com.java.practise.ds.tree.bst.BST;

public class BSTDemo{
public static void main(String... ar){
BST bst = new BST();
 int[] arr = new int[]{100,50,25,10,75,90,99,200,150,300};

 for(int i=0; i<arr.length; i++)
	bst.rootP = bst.insert(bst.rootP, arr[i]);

 System.out.println("\nMinimum value of the BST is "+bst.findMin(bst.rootP));

 System.out.println("\nMaximum value of the BST is "+bst.findMax(bst.rootP)); 

 System.out.println("\n\nPreOrder Traversal of BST is : ");
 preOrder(bst.rootP);

 bst.rootP = bst.delete(bst.rootP, 99);
 bst.rootP = bst.delete(bst.rootP, 10);
 bst.rootP = bst.delete(bst.rootP, 75);
 bst.rootP = bst.delete(bst.rootP, 100);

 System.out.println("\n\nPreOrder Traversal of BST is : ");
 preOrder(bst.rootP);

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

}