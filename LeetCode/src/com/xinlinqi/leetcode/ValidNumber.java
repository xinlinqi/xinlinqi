package com.xinlinqi.leetcode;

public class ValidNumber {
	public boolean isNumber(String s) {
		try{
			s = s.toLowerCase();
			Double.valueOf(s);
		}catch(java.lang.NumberFormatException e){
			return false;
		}
		return !s.contains("f") && !s.contains("d");
    }
	
	public static void main(String[] args){
		ValidNumber vn = new ValidNumber();
		System.out.print(vn.isNumber(" 959440.94D "));
	}
	
}
