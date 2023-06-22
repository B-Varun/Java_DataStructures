package com.java.learn.ds.queue;

public class Queue_With_List{

public static void main(String... tar){

QueueLL queue = new QueueLL();

queue.print();
for(int i=1; i<=10; i++)
	queue.enqueue(i);
queue.print();

System.out.println("Front of the queue is : "+queue.front());
System.out.println("Rear of the queue is : "+queue.rear());


for(int i=0; i<10; i++)
	System.out.println("Deleted element is : "+queue.dequeue());

queue.print();
System.out.println("Front of the queue is : "+queue.front());
System.out.println("Rear of the queue is : "+queue.rear());
}
}