package com.java.learn.data.structures.stacks;

public class Stack{
private int[] data = new int[10];
private int top = -1;

public boolean isEmpty(){
 if(top < 0)
  return true;
 return false;
}

public boolean isFull(){
 if(top == 9)
  return true;
 return false;
}

public int peek(){
 if(isEmpty())
     return -1;
 return data[top];
}

public void push(int ele){
 if(isFull())
      System.out.println("Stack Overflow Not able to add element");
 else{
      data[++top] = ele;
 }
}

public int pop(){
 if(isEmpty())
     System.out.println("Stack Underflow, not able to delete element");
 else{
     return data[top--];
 }
return -1;
}
}

class MainClass{
public static void main(String... arfs){
 Stack stack = new Stack();
 System.out.println("*** Stack ***");
 System.out.println("Is Stack Empty : "+stack.isEmpty());
 System.out.println("Is Stack Full : "+stack.isFull());
 stack.push(1);
 stack.push(2);
 stack.push(3);
 System.out.println("Popped : "+stack.pop());
 System.out.println("Popped : "+stack.pop());
 System.out.println("Is Stack Empty : "+stack.isEmpty());
 System.out.println("Is Stack Full : "+stack.isFull());
 stack.push(2);
 stack.push(3);
 stack.push(4);
 stack.push(5);
 stack.push(6);
 stack.push(7);
 stack.push(8);
 stack.push(9);
 stack.push(10);
 System.out.println("Is Stack Empty : "+stack.isEmpty());
 System.out.println("Is Stack Full : "+stack.isFull());
 System.out.println("Top most element of the stack : "+stack.peek());
}
}