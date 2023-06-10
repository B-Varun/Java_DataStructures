package com.java.learn.data.structures;

public class MySingleLinkedList{

// Head pointer to the linked list
public Object head = null;

public void addNewNode(int data){
if(head == null)
 head = new Node(data);
else{
 Object tempNode = head;
 while(((Node)tempNode).next != null)
      tempNode = ((Node)tempNode).next;
 ((Node)tempNode).next = new Node(data);
}
//printList();
}


public void printList(){
System.out.print("\nElements of the list are : ");
Object temp = head;
while(temp != null){
 System.out.print(((Node)temp).data+"\t");
 temp = ((Node)temp).next;
}
System.out.println();
}

public static void main(String... args){
MySingleLinkedList list = new MySingleLinkedList();
list.addNewNode(1);
list.addNewNode(2);
list.addNewNode(3);
list.addNewNode(4);
list.addNewNode(5);
list.addNewNode(6);
list.addNewNode(7);
list.addNewNode(8);
list.addNewNode(9);
list.addNewNode(10);
list.printList();
}
}