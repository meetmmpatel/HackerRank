package com.hackerRank.practice.regex;

import java.util.Arrays;
import java.util.List;

public class JavaRegexIPpattern {
	
	public static void main(String[] args) {
		
		List <String> validIPList = Arrays.asList("1.1.1.1", "255.255.255.255",
                "192.168.1.2", "10.10.1.1", "132.253.111.10", "26.10.2.10",
                "127.0.0.1");
		
		MyRegex myRegex = new MyRegex();
		
		for (String ipAddress : validIPList) {
			System.out.println(ipAddress + "Valid "+myRegex.Validate(ipAddress));
			
			
		}
		
		
		
		
	}


}
