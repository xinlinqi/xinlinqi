package com.xinlinqi.leetcode;

public class PlusOne {
	public int[] plusOne(int[] digits) {
        int[] res = new int[digits.length];
        int carry = 1;
         
        for(int i=digits.length-1; i >= 0; i--){
        	res[i] = (digits[i] + carry) % 10;
        	carry = (digits[i] + carry) / 10;
        }
        
        if(carry != 0){
        	int[] arr = new int[digits.length+1];
        	for(int i=0; i < res.length; i++){
        		arr[i+1] = res[i];
        	}
        	arr[0] = carry;
        	return arr;
        }
        
        return res;
    }
	
	public static void main(String[] args){
		PlusOne po = new PlusOne();
		int[] digits = {9};
		int[] res = po.plusOne(digits);
		for(int i=0; i < res.length; i++){
			System.out.print(res[i]);
		}
	}
}
