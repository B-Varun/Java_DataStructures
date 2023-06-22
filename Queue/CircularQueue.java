package com.java.learn.ds.queue;

class Queue{
int size = 10;
int[] arr = new int[size];
int front, rear;

public Queue(){
front = 0;
rear = 0;
}

public void enqueue(int ele){
 if(isFull()){
	System.out.println("Queue is Full. Can't insert "+ele);
	return;
 }
 rear = (rear+1)%size;
 arr[rear] = ele;
}

public int dequeue(){
 if(isEmpty()){
	System.out.println("Queue is Empty");
	return -1;
 }
 front = (front+1)%size;
 return arr[front];
}

public boolean isEmpty(){
 return (front == rear) ? true : false;
}

public boolean isFull(){
 return (((rear+1) % size) == front) ? true : false;
}

public int front(){
 return isEmpty() ? -1 : arr[(front+1)%size];
}

public int rear(){
 return isEmpty() ? -1 : arr[rear];
}

public void print(){
 if(isEmpty()){
	System.out.println("Queue is empty");
	return;
 }
 System.out.print("Elements of the Queue are : ");
 int f = (front+1)%size;
 while(f!=rear){
	System.out.print(arr[f]+"\t");
	f = (f+1)%size;
}
 System.out.println(arr[f]);
}

}

public class CircularQueue{

public static void main(String... que){
Queue queue = new Queue();
queue.print();

for(int i=1; i<=10; i++)
	queue.enqueue(i);
queue.print();
System.out.println("Front of the queue is : "+queue.front());
System.out.println("Rear of the queue is : "+queue.rear());

for(int i=1; i<=10; i++)
	System.out.println("Deleted : "+queue.dequeue());
queue.print();
System.out.println("Front of the queue is : "+queue.front());
System.out.println("Rear of the queue is : "+queue.rear());
}

}
