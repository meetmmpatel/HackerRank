package com.hackerRank.practice;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
	
	
	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		BigInteger b1 = in.nextBigInteger();
		BigInteger b2 = in.nextBigInteger();
		

		BigInteger b3 = b1.add(b2);
		BigInteger b4 = b1.multiply(b2);
		
		System.out.println(b3);
		System.out.println(b4);
		
		
	}
	
	
	
	
	

}
