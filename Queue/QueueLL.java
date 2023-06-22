package com.java.learn.ds.queue;

public class QueueLL{

public Node front, rear;

public QueueLL(){
 front = rear = null;
}

public void enqueue(int ele){
 Node new_Node = new Node(ele);

 if(isEmpty())
	front = rear = new_Node;
 else{
	rear.next = new_Node;
	rear = new_Node;
 }
}

public int dequeue(){
 if(isEmpty()){
	System.out.println("Queue is Empty");
	return -1;
 }
 else if(front == rear){
	int ele = front.data;
	front = rear = null;
	return ele;
 }
 int ele = front.data;
 front = front.next;
 return ele;
}

public boolean isEmpty(){
 return (rear == null && front == null) ? true : false;
}

public int front(){
 return (!isEmpty()) ? front.data : -1;
}

public int rear(){
 return (!isEmpty()) ? rear.data : -1;
}

public void print(){
 if(isEmpty()){
	System.out.println("Queue is Empty");
	return;
 }
System.out.print("elements of the list are: ");
 Node temp = front;
 while(temp != null){
	System.out.print(temp.data+"\t");
	temp = temp.next;
 }
}

}