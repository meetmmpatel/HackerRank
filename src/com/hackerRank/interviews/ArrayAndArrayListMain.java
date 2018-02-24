package com.hackerRank.interviews;

import java.util.Arrays;

public class ArrayAndArrayListMain {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 2, 3, 6, 7, 0 };
		// Arrays.sort(a);

		int bin = Arrays.binarySearch(a, 3);
		System.out.println(bin);

		int[] copy = Arrays.copyOf(a, a.length);
		System.out.println("Copy " + Arrays.toString(copy));

		int[] copyOfRange = Arrays.copyOfRange(a, 2, 4);
		System.out.println("Recopy" + Arrays.toString(copyOfRange));

		for (int i = 0; i < a.length; i++) {

			System.out.println(Arrays.toString(a));

		}

	}

}
