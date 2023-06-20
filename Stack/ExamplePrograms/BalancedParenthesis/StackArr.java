package com.java.learn.ds.stack.examples;

public class StackArr{
 int size = 10;
 char[] arr = new char[size];
 int top = -1;
 
 public void push(char c){
   if(isOverFlow())
	return;
   arr[++top] = c;
 }

 public char pop(){
   if(isUnderFlow())
	return ' ';
   char ch = arr[top--];
   return ch;
 } 
 
 public boolean isOverFlow(){
    if((top+1) == size){
      System.out.println("Overflow");
      return true;
    }
    return false;
 }

 public boolean isUnderFlow(){
   if(top == -1){
      System.out.println("Underflow"); 
      return true;
   }
   return false;
 }

 public char peek(){
   return (top == -1) ? ' ' : arr[top];
 } 
}