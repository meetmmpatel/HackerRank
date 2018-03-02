package com.hackerRank.practice;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double payment = scan.nextDouble();

		String us = DecimalFormat.getCurrencyInstance().format(payment);
		System.out.println("US " + us);
		
		Locale locale = new Locale("en", "IN");
		DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getCurrencyInstance(locale);
		DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance(locale);
		decimalFormat.setDecimalFormatSymbols(dfs);
		
		System.out.println("India: " + decimalFormat.format(payment));
		
		String china = DecimalFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		System.out.println("China  " + china);
		
		String france = DecimalFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
		System.out.println("France: " + france);
		
		
		
		

	}

}
