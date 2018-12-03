package com.java.drJava;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);
		/* Declare second integer, double, and String variables. */
		int iVal = 0;
		double dVal = 0.0;
		String sVal = null;
		/* Read and save an integer, double, and String to your variables. */
		// Note: If you have trouble reading the entire String, please go back and
		// review the Tutorial closely.
		iVal = scan.nextInt();
		dVal = scan.nextDouble();
		scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		sVal = scan.nextLine();
		System.out.println(sVal);
		/* Print the sum of both integer variables on a new line. */
		System.out.println((iVal + i));
		/* Print the sum of the double variables on a new line. */
		System.out.println((dVal + d));
		/*
		 * Concatenate and print the String variables on a new line; the 's' variable
		 * above should be printed first.
		 */
		System.out.println((s + sVal));
		scan.close();
	}
}