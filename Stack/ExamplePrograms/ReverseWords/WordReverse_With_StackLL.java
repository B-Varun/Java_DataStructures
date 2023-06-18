package com.java.learn.ds.stack.examples;

public class WordReverse_With_StackLL{
public static void main(String... args){
String str = "Hello";
System.out.println("String before Reverse : "+str);
str = reverse(str);
System.out.println("String after Reverse : "+str);
}

public static String reverse(String s){
StackLL stack = new StackLL();
 for(int i=0; i<s.length(); i++)
      stack.push(s.charAt(i));
String reversedStr = "";

 for(int i=0; i<s.length(); i++)
     reversedStr += stack.pop();

return reversedStr;
}
}