package com.java.learn.ds.stack.examples;

public class StackArr{
int size = 10;
char[] arr = new char[size];
int top = -1;

public void push(char ch){
 if(isOverFlow()){
    System.out.println("Stack Full");
    return;
 }
 arr[++top] = ch;
}

public char pop(){
 if(top == -1){
      System.out.println("Stack Empty");
      return ' ';
 }
 return arr[top--];
}

public boolean isOverFlow(){
if(top+1 == size)
 return true;
return false;
}

public boolean isUnderFlow(){
if(top == -1)
 return true;
return false;
}

public char peek(){
 if(top == -1)
    return ' ';
 return arr[top];
}
}