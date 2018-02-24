package com.hackerRank.practice;

import java.util.Scanner;

/* class is to define end of file concepts
 * when you have file coming as input and you need the read the file
 * till the end. than you should use this method.
 * read the file by Scanner class
 * use hasNext(); to see if there is next character in file
*/

public class EndOfTheFile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		while(scan.hasNext()) {
			String s = scan.nextLine();
			System.out.println(i + " " + s);
			i++;
		}
		
		
	}

}
