package com.java.learn.data.structures;

public class MyLinkedList{

// Pointer to Head node.
public Object head = null;

// Method that adds a new node to the list and initializes the node with the data passed.
public void addNewNode(int data){
if(head == null){
 head = new Node(data);
}
else{
 Object temp_Pointer = head;

 while(((Node)temp_Pointer).next != null)
      temp_Pointer = ((Node)temp_Pointer).next;
  ((Node)temp_Pointer).next = new Node(data);
}
printList();
}

public void printList(){
Object temp = head;
System.out.println("\nThe list elements are : ");
while(temp!=null){
System.out.print(((Node)temp).data+"\t");
temp = ((Node)temp).next;
}
}

public static void main(String... args){
MyLinkedList list = new MyLinkedList();
list.addNewNode(10);
list.addNewNode(50);
list.addNewNode(100);
list.addNewNode(200);
list.addNewNode(300);
list.addNewNode(400);
list.addNewNode(500);
list.addNewNode(600);
}
}