package com.java.learn.data.structures;

import static java.lang.System.out;
//Node_DLL

public class MyCircularDoubleLinkedList{

// Head Pointer to the Circular Double linked list
public Object head = null;

public void addElement(int data){
if(head == null){
 head = new Node_DLL(data);
 ((Node_DLL)head).next = head;
 ((Node_DLL)head).prev = head;
}
else{
 Object temp_P = head;
 while(((Node_DLL)temp_P).next != head)
    temp_P = ((Node_DLL)temp_P).next;
 Object new_Node = new Node_DLL(data);
 ((Node_DLL)new_Node).next = ((Node_DLL)temp_P).next;
 ((Node_DLL)new_Node).prev = temp_P;
 ((Node_DLL)((Node_DLL)temp_P).next).prev = new_Node;
 ((Node_DLL)temp_P).next = new_Node;
}
}

public void print(){
Object temp = head;
System.out.print("\nElements of the Circular Double Linked List are : ");
while(((Node_DLL)temp).next!=head){
System.out.print(((Node_DLL)temp).data+"\t");
temp = ((Node_DLL)temp).next;
}
System.out.println(((Node_DLL)temp).data);
}

public static void main(String... arfs){
out.println("***Circular Double Linked List***");
MyCircularDoubleLinkedList list = new MyCircularDoubleLinkedList();
list.addElement(1);
list.addElement(2);
list.addElement(3);
list.addElement(4);
list.addElement(5);
list.print();
}
}