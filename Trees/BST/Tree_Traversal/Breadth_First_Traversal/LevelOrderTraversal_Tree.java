package com.java.learn.ds.tree.bst.traversal;

import com.java.learn.ds.node.Node;
import com.java.learn.ds.tree.bst.BST;
import com.java.learn.ds.queue.Queue;

public class LevelOrderTraversal_Tree{
public static void main(String... tree){
BST bst = new BST();
int[] array = new int[]{100,20,300,4,50,260,700};
for(int i=0; i<array.length; i++)
      bst.rootPtr = bst.insert(bst.rootPtr, new Node(array[i]));

System.out.println("The Breadth First Traversal Of BST is :");
depth_First_Traversal(bst.rootPtr);
}

public static void depth_First_Traversal(Node root){
 Queue queue = new Queue();
 queue.enqueue(root);

while(!queue.isEmpty()){
 root = queue.front();
 if(root == null){
	System.out.println("Tree is empty");
	return;
 }
 if(root.left != null)
	queue.enqueue(root.left);
 if(root.right != null)
	queue.enqueue(root.right);
 System.out.print(queue.dequeue().data+"\t");
}
}

}