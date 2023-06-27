package com.java.learn.ds.tree.bst.delete;

import com.java.learn.ds.node.Node;
import com.java.learn.ds.tree.bst.BST;

public class DeleteLeaf{
public static void main(String... tree){
 BST bst = new BST();
 int[] arr = new int[]{100,50,200,25,75,150,300};
 
 for(int i=0; i<arr.length; i++)
	bst.rootPtr = BST.insert(bst.rootPtr, new Node(arr[i]));
 System.out.println("\n\nPreorder traversal of the tree is : ");
 preOrder(bst.rootPtr);
 bst.rootPtr = bst.deleteLeafNode(bst.rootPtr, 25);
 System.out.println("\n\nPreorder traversal of the tree is : ");
 preOrder(bst.rootPtr);
 bst.rootPtr = bst.deleteLeafNode(bst.rootPtr, 150);
 System.out.println("\n\nPreorder traversal of the tree is : ");
 preOrder(bst.rootPtr);
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