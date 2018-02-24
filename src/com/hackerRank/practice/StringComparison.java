package com.hackerRank.practice;

public class StringComparison {
	
	public static void main(String[] args) {
		String A = "Hello";
		String B = "Java";
		
		
			System.out.println(A.length() + B.length());
			
			int Aplus = A.compareTo(B);
			int Bplus = B.compareTo(A);
			
			if (Aplus <= 0) {
				System.out.println("True");
			}
			else {
				System.out.println("false");
			}
			String s1 = A.substring(0,1).toUpperCase()+ A.substring(1);
			String s2 = B.substring(0,1).toUpperCase()+ B.substring(1);
		
			System.out.println(s1 +" "+ s2);
		

		
		
		
	}
	
	
	

}
