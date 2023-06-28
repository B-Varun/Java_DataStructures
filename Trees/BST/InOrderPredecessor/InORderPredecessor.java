package com.java.learn.ds.tree.bst.inorder;

import com.java.learn.ds.node.Node;
import com.java.learn.ds.tree.bst.inorder.BST;

public class InORderPredecessor{
public static void main(String... tree){
 int[] arr = new int[]{100,50,200,25,10,75,60,55,90,99,150,300};
 BST bst = new BST();

 for(int i=0; i<arr.length; i++)
	bst.rootPtr = bst.insert(bst.rootPtr, new Node(arr[i]));

 System.out.println("InOrder Predecessor of 50 is : "+inOrderPredecessor(bst.rootPtr, 50));

 System.out.println("InOrder Predecessor of 100 is : "+inOrderPredecessor(bst.rootPtr, 100));

 System.out.println("InOrder Predecessor of 200 is : "+inOrderPredecessor(bst.rootPtr, 200));
}

public static int inOrderPredecessor(Node root, int rootVal){
 if(root == null)
	return -1;
 else if(root.data > rootVal)
	return inOrderPredecessor(root.left, rootVal);
 else if(root.data < rootVal)
	return inOrderPredecessor(root.right, rootVal);
 else
	return predecessor(root.left);
}

public static int predecessor(Node root){
 if(root.right == null)
	return root.data;
 else 
	return predecessor(root.right);
}

}