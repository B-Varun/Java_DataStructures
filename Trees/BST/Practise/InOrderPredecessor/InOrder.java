package com.java.learn.ds.tree.bst.inorder;
import com.java.learn.ds.node.Node;
import com.java.learn.ds.tree.bst.BST;

public class InOrder{
public static void main(String... tree){
BST bst = new BST();
int[] arr = new int[]{100,50,25,200,150,300,75,90,99,10};

for(int i=0; i<arr.length; i++)
	bst.rootP = bst.insert(bst.rootP, new Node(arr[i]));

System.out.println("\n\nPre Order of the tree is : ");
preOrder(bst.rootP);

bst.rootP = bst.delete(bst.rootP, 100);

System.out.println("\n\nPre Order of the tree is : ");
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