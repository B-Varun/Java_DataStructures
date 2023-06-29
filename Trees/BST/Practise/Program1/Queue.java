package com.java.practise.ds.queue;

import com.java.practise.ds.node.Node;

public class Queue{
int size = 10;
Node[] arr = new Node[size];
int front, rear;
public Queue(){
 front = rear = -1;
}

public void enqueue(Node ele){
 if(isEmpty()){
	front = rear = 0;
	arr[rear] = ele;
 }
 else if(!isFull())
	arr[++rear] = ele;
 else
	System.out.println("Queue is full");
}

public Node dequeue(){
 if(isEmpty()){
	System.out.println("Queue is Empty");
	return null;
 }
 else if(front == rear){
	Node ele = arr[front];
	front = rear = -1;
	return ele;
 }
 else
	return arr[front++];
}

public boolean isEmpty(){
 return (front == -1) ? true : false;
}

public boolean isFull(){
 return ((rear+1) == size) ? true : false;
}

public Node front(){
 return (isEmpty()) ? null : arr[front];
}

public Node rear(){
 return isEmpty() ? null : arr[rear];
}

}