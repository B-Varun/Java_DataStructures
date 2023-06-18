package com.java.learn.ds.stack.examples;

public class ReverseWords{
public static void main(String... args){
String str = "Hello";
System.out.println("String before reverse : "+str);
str = reverse(str);
System.out.println("String after reverse : "+str);
}

public static String reverse(String s){
StackArr stack = new StackArr();

for(int i=0; i<s.length(); i++)
    stack.push(s.charAt(i));

String reversedStr="";

for(int i=0; i<s.length(); i++)
 reversedStr+=stack.pop();


return reversedStr;
}
}