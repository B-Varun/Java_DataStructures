package com.java.learn.ds.queue;

import com.java.learn.ds.node.Node;

public class Queue{
int size = 10;
Node[] arr = new Node[size];
int front, rear;

public Queue(){
 front = rear = -1;
}

public void enqueue(Node data){
 if(isEmpty()){
	front++;
	arr[++rear] = data;
 }
 else if(isFull()){
	System.out.println("Queue is Full");
	return;
 }
 else
	arr[++rear] = data;	
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
 else{
	Node ele = arr[front++];
	return ele;
 }
}

public boolean isEmpty(){
 return (front ==-1 && rear == -1) ? true : false;
}

public boolean isFull(){
 return ((rear+1) == size) ? true : false;
}

public Node front(){
 return isEmpty() ? null : arr[front];
}

public Node rear(){
 return isEmpty() ? null : arr[rear];
}
}
