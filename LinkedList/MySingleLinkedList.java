package com.java.learn.data.structures;

public class MySingleLinkedList{

// Head pointer to the linked list
public static Object head = null;

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

public void reverse(){
Object prev=null, curr=head, next=((Node)head).next;
while(((Node)curr).next != null){
 ((Node)curr).next = prev;
 prev = curr;
 curr = next; 
 next = ((Node)next).next;
}
((Node)curr).next = prev;
head = curr;
printList();
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


System.out.print("\nAfter reversing :");
//list.reverse();
Object h = head;
//list.recrusiveReverseList(h);
list.recReverse(null, h);
list.printList();
}

// Prints list elements in reverse order. No elements are interchanged.
public void recrusiveReverseList(Object head){
if(head == null)
return;
else {
recrusiveReverseList(((Node)head).next);
System.out.print(((Node)head).data+"\t");
}
}

// Reverses the list elements in reverse order
public void recReverse(Object prev, Object curr){
if(((Node)curr).next == null) 
{
  ((Node)curr).next = prev;
  head = curr;
}
else{
 recReverse(curr, ((Node)curr).next);
 ((Node)curr).next = prev; 
}
}


}