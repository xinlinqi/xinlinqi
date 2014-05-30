package com.xinlinqi.leetcode;

public class ReverseWordsInAString {
	public String reverseWords(String s) {
		s = s.replaceAll("\\s+", " ").trim();
		String arr[] = s.split(" ");
		StringBuilder res = new StringBuilder();
		for(int i=arr.length-1; i >= 0; i--){
			res.append(arr[i] + " ");
		}
		if(res.toString().length() == 0){
			return "";
		}
        return res.toString().substring(0, res.toString().length()-1);
    }
	
	public static void main(String[] args){
		ReverseWordsInAString rs = new ReverseWordsInAString();
		System.out.print(rs.reverseWords(" 1"));
	}
	
}
