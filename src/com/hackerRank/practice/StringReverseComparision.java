package com.hackerRank.practice;

public class StringReverseComparision {
	public static void main(String[] args) {
		
		String A = "madame";
		
		
		StringBuilder A1 = new StringBuilder();
		A1.append(A);
		A1.reverse();
		
		System.out.println(A1);
		
		if (A.contentEquals(A1) ) {
			System.out.println("true");
		}else {
			System.out.println("no");
		}
		
		
		
		

	}

}
