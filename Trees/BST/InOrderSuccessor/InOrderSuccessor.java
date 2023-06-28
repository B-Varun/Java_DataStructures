package com.java.learn.ds.tree.bst.inorder;

import com.java.learn.ds.node.Node;
import com.java.learn.ds.tree.bst.inorder.BST;

public class InOrderSuccessor{
public static void main(String... tree){
 int[] arr = new int[]{100,50,200,25,10,75,60,55,90,99,150,300};
 BST bst = new BST();
 
 for(int i=0; i<arr.length; i++)
	bst.rootPtr = bst.insert(bst.rootPtr, new Node(arr[i]));

 System.out.println("InOrderSuccessor of 100 is : "+inOrderSuccessor(bst.rootPtr, 100));

 System.out.println("InOrderSuccessor of 50 is : "+inOrderSuccessor(bst.rootPtr, 50));

}

public static int inOrderSuccessor(Node root, int rootVal){
 if(root == null)
	return -1;
 else if(root.data > rootVal)
	return inOrderSuccessor(root.left, rootVal);
 else if(root.data < rootVal)
	return inOrderSuccessor(root.right, rootVal);
 else
	return successor(root.right);
}

 public static int successor(Node root){
  if(root.left == null)
	return root.data;
  else
	return successor(root.left);
 }

}
