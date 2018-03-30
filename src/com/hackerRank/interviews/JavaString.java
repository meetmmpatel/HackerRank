package com.hackerRank.interviews;

public class JavaString {
	
	//Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
	//The string length will be at least 2.
	
	public static void main(String[] args) {
	
		String sample = "ab";
		JavaString java = new JavaString();
		
		System.out.println(java.extraEnd(sample));
		
		
	}
	
	
	
	public String extraEnd(String str) {
		
		int last = str.length() -2;
//		System.out.println(last);
		
		
		 String output = str.substring(last,str.length());
		 for (int i =0; i < 2; i ++) {
			 
			 
			 
			 System.out.print(output);
			 
		 }
		
		return output;
		  
	}
	
	

}
