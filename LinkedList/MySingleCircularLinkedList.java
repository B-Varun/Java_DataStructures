package com.java.learn.data.structures;

public class MySingleCircularLinkedList{

// Head pointer of the list, points to the last node of the circular linked list
public static Object head = null;

public void addElement(int data){
if(head == null)
{
 head = new Node(data);
 ((Node)head).next = head;
}
else{
 Object new_node = new Node(data);
 ((Node)new_node).next = ((Node)head).next;
 ((Node)head).next = new_node;
 head = new_node;

/* This code is valid only if the head Pointer points to the 1st node of the list. But in circular linked list the head pointer points to the last node of the list 
 while(((Node)tempPointer).next != head)
  tempPointer = ((Node)tempPointer).next;
 
 ((Node)tempPointer).next = new_node;
 ((Node)new_node).next = head;
System.out.println("\nPointing to : "+((Node)head).data);
*/
}
}

public void print(){
 System.out.print("\nThe elements of the Circular Linked List are : ");
 Object temp_Pointer = ((Node)head).next;
 while(temp_Pointer != head){
    System.out.print(((Node)temp_Pointer).data+"\t");  
    temp_Pointer = ((Node)temp_Pointer).next;
 }
 System.out.println(((Node)temp_Pointer).data);
}

public static void main(String... args){
System.out.println("***Circular LinkedList***");
MySingleCircularLinkedList list = new MySingleCircularLinkedList();
list.addElement(1);
list.addElement(2);
list.addElement(3);
list.addElement(4);
list.addElement(5);
list.print();
}
}