package com.java.learn.ds.tree.bst.traversal;

import com.java.learn.ds.node.Node;
import com.java.learn.ds.tree.bst.BST;

public class PreOrderTraversal{

public static void main(String... tree){
BST bst = new BST();
int[] arr = new int[]{100,20,300,4,50,260,700};

for(int i=0; i<arr.length; i++)
  bst.rootPtr = BST.insert(bst.rootPtr, new Node(arr[i]));

System.out.println("PreOrder traversal of BST : ");
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