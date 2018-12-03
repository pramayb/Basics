package com.java.hacker_rank.warmup;

import java.io.IOException;
import java.util.Scanner;

public class SockMerchant {

	// Find number of pair of socks in given array
	static int sockMerchantComb(int n, int[] ar) {
		int counter = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (i == j)
					continue;
				if (ar[i] > 0 && ar[i] == ar[j]) {
					counter++;
					ar[i] = -1;
					ar[j] = -1;

					break;
				}
			}
		}
		return counter;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchantComb(n, ar);

		System.out.println(result);
		scanner.close();
	}
}
