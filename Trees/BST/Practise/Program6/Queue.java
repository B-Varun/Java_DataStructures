package com.java.practise.ds.queue;
import com.java.practise.ds.node.Node;

public class Queue{
private int size = 10;
private Node[] arr = new Node[size];
private int front, rear;

public Queue(){
front = rear = -1;
}

public void enqueue(Node ele){
if(isEmpty()){
 ++front;
 arr[++rear] = ele;
}
else if(isFull())
	System.out.println("Queue full");
else
	arr[++rear] = ele;
}

public Node dequeue(){
if(isEmpty())
	System.out.println("Queue is Empty");
else if(front == rear){
	Node ele = arr[front];
	front = rear = -1;
	return ele;
 }
else
	return arr[front++];
return null;
}

public boolean isEmpty(){
return (front == -1) ? true : false;
}

public boolean isFull(){
return (rear+1 == size) ? true : false;
}

public Node front(){
return isEmpty() ? null : arr[front];
}

public Node rear(){
return isEmpty() ? null : arr[rear];
}
}