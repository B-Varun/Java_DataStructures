package com.java.practise.trees.bfs;
import com.java.practise.ds.queue.Queue;
import com.java.practise.ds.tree.traversal.bfs.Tree;
import com.java.practise.node.Node;
public class Breadth_First_Search{
public static void main(String... args){
Tree bst = new Tree();
System.out.println("Is tree empty : "+bst.isEmpty());
int[] elements = new int[]{50,100,25,10,35,75,150};
for(int i=0; i<elements.length; i++){
  bst.rootP = bst.insert(bst.rootP, elements[i]);
}
bfs(bst.rootP);
System.out.println("\n\n");

}

public static void inOrder(Node root){
if(root == null)
 return;
inOrder(root.left);
System.out.print(root.data+"\t");
inOrder(root.right);
}

public static void bfs(Node root){
if(root == null){
System.out.println("The tree is empty");
return;
}
System.out.println("BFS Traversal of the tree is : ");
Queue queue = new Queue();
queue.enqueue(root);

while(!queue.isEmpty()){
Node node = queue.front();
if(node.left!=null)
 queue.enqueue(node.left);
if(node.right!=null)
 queue.enqueue(node.right);
System.out.print(queue.dequeue().data+"\t");
}
}
}