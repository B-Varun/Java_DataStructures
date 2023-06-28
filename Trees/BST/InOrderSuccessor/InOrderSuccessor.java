package com.java.learn.ds.tree.bst.inorder;

import com.java.learn.ds.node.Node;
import com.java.learn.ds.tree.bst.inorder.BST;

public class InOrderSuccessor{
public static void main(String... tree){
 int[] arr = new int[]{100,50,200,25,10,75,60,55,90,99,150,300};
 BST bst = new BST();
 
 for(int i=0; i<arr.length; i++)
	bst.rootPtr = bst.insert(bst.rootPtr, new Node(arr[i]));

 System.out.println("InOrderSuccessor of 100 is : "+inOrderSuccessor(bst.rootPtr, bst.rootPtr, 100));

 System.out.println("InOrderSuccessor of 50 is : "+inOrderSuccessor(bst.rootPtr, bst.rootPtr, 50));

 System.out.println("InOrderSuccessor of 90 is : "+inOrderSuccessor(bst.rootPtr, bst.rootPtr, 90));

 System.out.println("InOrderSuccessor of 99 is : "+inOrderSuccessor(bst.rootPtr, bst.rootPtr, 99));

 System.out.println("InOrderSuccessor of 150 is : "+inOrderSuccessor(bst.rootPtr, bst.rootPtr, 150));

}

public static int inOrderSuccessor(Node root, Node temp, int rootVal){
 if(temp == null)
	return -1;
 else if(temp.data > rootVal)
	return inOrderSuccessor(root, temp.left, rootVal);
 else if(temp.data < rootVal)
	return inOrderSuccessor(root, temp.right, rootVal);
 else{
	if(temp.right !=null)
		return successor(temp.right);
	else
		return nearestAncestor(root, temp);
 }
}

 public static int successor(Node root){
  if(root.left == null)
	return root.data;
  else
	return successor(root.left);
 }

 public static int nearestAncestor(Node root, Node temp){
   Node successor = null;
   Node curr = root;

  while(curr != temp){
   if(curr.data > temp.data){
	successor = curr;
	curr = curr.left;
   }
   else if(curr.data < temp.data){
	successor = curr;
	curr = curr.right;
   }	
  }
  return successor.data;
 }

}
