package com.hackerRank.practice.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {

	private Pattern pattern;
	private Matcher matcher;

	private static final String IP_ADDRESS_REGEX = "^([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])\\\\.\"\n"
			+ "+ \"([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])\\\\.\"\n"
			+ "+ \"([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])\\\\.\"\n"
			+ "+ \"([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])$";
	
	public MyRegex() {
		pattern = Pattern.compile(IP_ADDRESS_REGEX);
	}
	
	public boolean Validate(final String ipAddress) {
		matcher = pattern.matcher(IP_ADDRESS_REGEX);
		return matcher.matches();
	}

	

}
