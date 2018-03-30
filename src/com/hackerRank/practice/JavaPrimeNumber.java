package com.hackerRank.practice;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimeNumber {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		BigInteger n = in.nextBigInteger();
		in.close();
		
		if (n.isProbablePrime(1)) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
		
		
	}
	
	

}
