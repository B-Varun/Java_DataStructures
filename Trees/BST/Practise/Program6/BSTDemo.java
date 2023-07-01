package com.java.practise.ds.tree.bst.demo;
import com.java.practise.ds.node.Node;
import com.java.practise.ds.tree.bst.BST;
import com.java.practise.ds.queue.Queue;

public class BSTDemo{
public static void main(String... tree){
BST bst = new BST();
int[] arr= new int[]{100,50,75,25,10,90,99,200,150,300};

for(int i=0; i<arr.length; i++)
	bst.rootP = bst.insert(bst.rootP,new Node(arr[i]));

levelOrder(bst.rootP);
System.out.println("\nMin in bst is : "+bst.findMin(bst.rootP));
System.out.println("\nMax in bst is : "+bst.findMax(bst.rootP));

bst.rootP = bst.delete(bst.rootP, 100);
levelOrder(bst.rootP);
bst.rootP = bst.delete(bst.rootP, 99);
levelOrder(bst.rootP);
bst.rootP = bst.delete(bst.rootP, 10);
levelOrder(bst.rootP);

System.out.println("\nHeight of BST : "+height(bst.rootP));

System.out.println("\nDepth of BST : "+depth(bst.rootP, 100));
System.out.println("\nDepth of BST : "+depth(bst.rootP, 200));
System.out.println("\nDepth of BST : "+depth(bst.rootP, 300));
System.out.println("\nDepth of BST : "+depth(bst.rootP, 150));
System.out.println("\nDepth of BST : "+depth(bst.rootP, 25));

System.out.println("\nIs tree a BST : "+isBST(bst.rootP));
}

public static void levelOrder(Node root){
if(root == null)
	System.out.println("BST is empty");

Queue queue = new Queue();
queue.enqueue(root);
System.out.print("\n\nBreadth First Traversal of BST is : ");
while(!queue.isEmpty()){
Node node = queue.front();
if(node.left != null)
	queue.enqueue(node.left);
if(node.right != null)
	queue.enqueue(node.right);
System.out.print(queue.dequeue().data+"\t");
}
}

public static int max(int a, int b){
return (a>b) ? a : b;
}

public static int height(Node root){
if(root == null)
	return -1;
else
	return max(height(root.left), height(root.right))+1;
}

public static int depth(Node root, int data){
if(root == null)
	return -1;
else if(data > root.data)
	return depth(root.right, data)+1;
else if(data < root.data)
	return depth(root.left, data)+1;
return 0;
}

public static boolean isBST(Node root){
if((root == null) || ((root.left == null) && (root.right == null))) 
	return true;
else if((root.left == null) && (root.right.data > root.data))
	return isBST(root.right);
else if((root.right == null) && (root.left.data <= root.data))
	return isBST(root.left);
else if((root.left.data <= root.data) && (root.right.data > root.data))
	return isBST(root.left) && isBST(root.right);
else
return false;
}


}