package com.hackerRank.practice;

public class StaticBlock {
	// class, method and variable can be static
	// static means it will loaded when class will be called

	// static variables
	static int B = -9;
	static int H;
	static boolean flag = false;

	// static method
	static {
		
		B = 10;
		H = 12;
		System.out.println(B +""+H);
	

	}

	public static void main(String[] args) {

	}

}
