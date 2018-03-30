package com.hackerRank.practice;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalNumbers {
	
   public static void main(String[] args) {
	   
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   String []s = new String[n + 2];
	   for (int i =0; i < n; i ++) {
		   s[i] = sc.next();
		   
	   }
	   sc.close();
	   
	   BigDecimal bg = new BigDecimal(n);
	   
	   for (int i = 0; i < n; i++) {
		   System.out.println(s[i]);
	   }
	   
	

	   
}
	
	
	
	
	
	

}
