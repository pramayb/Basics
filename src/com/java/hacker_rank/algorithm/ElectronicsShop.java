package com.java.hacker_rank.algorithm;

import java.io.IOException;
import java.util.Scanner;

/*
 * Monica wants to buy a keyboard and a USB drive from her favorite electronics store. 
 * The store has several models of each. Monica wants to spend as much as possible for the  items, given her budget.
 * Given the price lists for the store's keyboards and USB drives, and Monica's budget, find and print the 
 * amount of money Monica will spend. If she doesn't have enough money to both a keyboard and a USB drive, print -1 
 * instead. She will buy only the two required items.
 * For example, suppose she has  to spend. Three types of keyboards cost . Two USB drives cost . 
 * She could purchase a , or a . She chooses the latter. She can't buy more than  items so she can't spend exactly .
 */
public class ElectronicsShop {
	/*
	 * Complete the getMoneySpent function below.
	 */
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		//b is the max amount to be spent
		//iterate through keyboard and check its combine price with drives
		//while iteration check if budget fits for each keyboard price, if yes than proceed to calculate max sum with drives
		//store maximum sum of price if it fits in budget else exclude
		//return budget if max sum calculated
		//if nothing fits in budget return -a
		int moneyToSpent=-1;
		for(int i=0;i<keyboards.length;i++) {
			if(keyboards[i]>b)
				continue;
			
			for(int j=0;j<drives.length;j++) {
				int comboPrice = keyboards[i]+drives[j];
				
				if(comboPrice <= b && comboPrice>moneyToSpent) {
					moneyToSpent=comboPrice;
				}
			}
		}
		return moneyToSpent;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String[] bnm = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		int b = Integer.parseInt(bnm[0]);

		int n = Integer.parseInt(bnm[1]);

		int m = Integer.parseInt(bnm[2]);

		int[] keyboards = new int[n];

		String[] keyboardsItems = scanner.nextLine().split(" ");

		for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
			int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
			keyboards[keyboardsItr] = keyboardsItem;
		}

		int[] drives = new int[m];

		String[] drivesItems = scanner.nextLine().split(" ");

		for (int drivesItr = 0; drivesItr < m; drivesItr++) {
			int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
			drives[drivesItr] = drivesItem;
		}

		/*
		 * The maximum amount of money she can spend on a keyboard and USB drive, or -1
		 * if she can't purchase both items
		 */

		int moneySpent = getMoneySpent(keyboards, drives, b);
		System.out.println(moneySpent);

		scanner.close();
	}
}
