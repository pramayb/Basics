package com.java.hacker_rank._30dayscode;

import java.util.Scanner;

public class LetsReview_day6 {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		for (int i = 0; i < cases; i++) {
			String input = scanner.nextLine();
			StringBuilder sbEven = new StringBuilder();
			StringBuilder sbOdd = new StringBuilder();
			for(int j=0; j<input.length();j++) {
				char inputChar = input.charAt(j);
				if(j==0 || j%2==0) {
					sbEven.append(inputChar);
				}else {
					sbOdd.append(inputChar);
				}
			}
			System.out.println(sbEven.toString()+" "+sbOdd.toString());
		}
		scanner.close();
	}
}
