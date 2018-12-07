package com.java.hacker_rank._30dayscode;

import java.util.Scanner;

public class Day11_2DArrays {
	private static final Scanner scanner = new Scanner(System.in);

	/*
	 * 1 1 1 0 0 0 0 1 0 0 0 0 1 1 1 0 0 0 0 0 2 4 4 0 0 0 0 2 0 0 0 0 1 2 4 0
	 * 
	 */
	public static void main(String[] args) {
		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		int maxSum = 0;
		boolean first=true;
		for (int i = 0; i <= 3; i++) {
			int firstRow = i;
			int secondRow = i + 1;
			int thirdRow = i + 2;

			for (int j = 0; j <=3; j++) {
				int currentSum = 0;
				int firstColumn = j;
				int secondColumn = j + 1;
				int thirdColumn = j + 2;
				
				currentSum = arr[firstRow][firstColumn] + arr[firstRow][secondColumn] + arr[firstRow][thirdColumn]
						+ arr[secondRow][secondColumn] + arr[thirdRow][firstColumn] + arr[thirdRow][secondColumn]
						+ arr[thirdRow][thirdColumn];

				if (currentSum > maxSum || first)
					maxSum = currentSum;
				first=false;
			}
		}
		System.out.println(maxSum);

		scanner.close();
	}
}
