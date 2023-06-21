package com.java.learn.ds.stack.examples;

public class PostFixEvaluation{

public static void main(String... args){
//String str = "2 3 * 5 4 * + 9 -";
String str = "2 3 5 * + 6 7 * + 9 + 5 1 * - 100 2 * +";
System.out.println("The given expression is : "+str);
int res = evaluatePostFix(str);
System.out.println("Result of the post fix expression is : "+res);
}

public static int evaluatePostFix(String str){
StackArr stack  = new StackArr();

while(!str.isEmpty()){
	int firstSpace = str.indexOf(' ');
	if(firstSpace == -1)
		break;
	String number = str.substring(0, firstSpace);
	if(isOperator(number)){
		int op1 = stack.pop();
		int op2 = stack.pop();
		int returnedResult = performArithmetic(number, op1, op2);
		stack.push(returnedResult);
	}
	else{
	int operand = Integer.valueOf(number);
	stack.push(operand);
	}
	str = str.substring(firstSpace+1,str.length());
}
stack.push(performArithmetic(str.substring(0, str.length()), stack.pop(), stack.pop()));

return stack.pop();
}

public static int performArithmetic(String operator, int op1, int op2){
 if(operator.equals("*"))
	return op1*op2;
 else if(operator.equals("/"))
	return op1/op2;
 else if(operator.equals("-"))
	return op2-op1;
 else
	return op1+op2;
}

public static boolean isOperator(String str){
	if(str.equals("+") || str.equals("-") || str.equals("/") || str.equals("*"))
		return true;
	return false;
}


}