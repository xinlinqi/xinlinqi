package com.xinlinqi.leetcode;

import java.util.Stack;

public class EvaluateReversePolishNotation {
	
	private Stack<String> stack = new Stack<String>();
	
    public int evalRPN(String[] tokens) {
    	for(int i=0; i < tokens.length; i++){
    		if(isOperator(tokens[i])){
    			String secondEle = stack.pop();
    			String firstEle = stack.pop();
    			if(!isOperator(firstEle) && !isOperator(secondEle)){
    				stack.push(operate(tokens[i], firstEle, secondEle));
    			}
    		}else{
    			stack.push(tokens[i]);
    		}
    	}
    	return Integer.valueOf(stack.peek());
    }
    
    private String operate(String operator, String firstOperand, String secondOperand){
    	int res = 0;
    	if(operator.compareTo("+") == 0){
    		res = Integer.valueOf(firstOperand) + Integer.valueOf(secondOperand);
    	}
    	if(operator.compareTo("*") == 0){
    		res = Integer.valueOf(firstOperand) * Integer.valueOf(secondOperand);
    	}
    	if(operator.compareTo("-") == 0){
    		res = Integer.valueOf(firstOperand) - Integer.valueOf(secondOperand);
    	}
    	if(operator.compareTo("/") == 0){
    		res = Integer.valueOf(firstOperand) / Integer.valueOf(secondOperand);
    	}
    	return String.valueOf(res);
    }
    
    private boolean isOperator(String s){
    	return s.equals("+") || s.equals("-") ||s.equals("*") || s.equals("/");
    }
    
    public static void main(String[] args){
    	EvaluateReversePolishNotation pn = new EvaluateReversePolishNotation();
    	String[] arr = {};
    	System.out.print(pn.evalRPN(arr));
    }
    
}
