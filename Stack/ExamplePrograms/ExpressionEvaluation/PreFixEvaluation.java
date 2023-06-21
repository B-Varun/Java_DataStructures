package com.java.learn.ds.stack.examples;

public class PreFixEvaluation{
public static void main(String... args){
String str = "- + * 2 3 * 5 4 9";
System.out.println("Prefix Expression to evaluate : "+str);
int result = evaluatePrefixExp(str);
System.out.println("Result of expr evaluation is : "+result);
}

public static boolean isOperator(String s){
 if(s.equals("*") || s.equals("/") || s.equals("+") || s.equals("-"))
	return true;
return false;
}


public static int evaluatePrefixExp(String str){
StackArr stack = new StackArr();

while(!str.isEmpty()){
	int lastLetter = str.lastIndexOf(' ');
	if(lastLetter == -1) 
		break;
	
	String ch = str.substring(lastLetter+1, str.length());

	if(isOperator(ch)){
		int op1 = stack.pop();
		int op2 = stack.pop();
		int result = resultOfArithmeticOp(ch, op1, op2);
		stack.push(result);
	}
	else{
		int c = Integer.valueOf(ch);
		stack.push(c);
	}
	str = str.substring(0, lastLetter);	
   }
int result = resultOfArithmeticOp(str, stack.pop(), stack.pop());
stack.push(result);
return stack.peek();
}

public static int resultOfArithmeticOp(String op, int operand1, int operand2){
	if(op.equals("*"))
		return operand1*operand2; 
	else if(op.equals("/"))
		return operand1/operand2;
	else if(op.equals("+"))
		return operand1+operand2;
	else
		return operand1-operand2;	
}
}