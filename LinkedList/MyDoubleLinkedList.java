package com.java.learn.data.structures;

import static java.lang.System.out;

public class MyDoubleLinkedList{

// Head Pointer
public Object head = null;

public void addElement(int data){
if(head == null){
 head = new Node_DLL(data);
 ((Node_DLL)head).prev = null;
 ((Node_DLL)head).next = null;
} 
else{
 Object tempP = head;
 Object new_Node = new Node_DLL(data);

 while(((Node_DLL)tempP).next != null)
    tempP = ((Node_DLL)tempP).next;

 ((Node_DLL)new_Node).prev = tempP;
 ((Node_DLL)tempP).next = new_Node;
}
}

public void print(){
 Object temp = head;
 System.out.print("\nElements of the Double Linked List are : ");
// while(((Node_DLL)temp).next != null){
 while(temp != null){
  System.out.print(((Node_DLL)temp).data+"\t");
  temp = ((Node_DLL)temp).next;
 }
}

public void reverse(){
Object prev = null, curr = head, temp = null;

while(curr != null){
 temp = curr;
 ((Node_DLL)temp).prev = ((Node_DLL)temp).next;
 ((Node_DLL)temp).next = prev;
 prev = temp;
 curr = ((Node_DLL)temp).prev;
}
head = temp;
}

public static void main(String... arg){
out.println("***Double Linked List***");
MyDoubleLinkedList list = new MyDoubleLinkedList();
list.addElement(1);
list.addElement(2);
list.addElement(3);
list.addElement(4);
list.addElement(5);
list.print();
System.out.print("\nList Reversal");
list.reverse();
list.print();
}
}