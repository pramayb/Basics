package com.java.basics;

import java.io.*;
import java.util.*;

public class CoinChange {
  
    /**
     * Complete the function below.
     * DONOT MODIFY anything outside this function!
     */
    static long numberOfWaysToPay(int[] denominations,int denominationCount, int rent) {
        final Set<String> combinations=new HashSet<>();
		final String currentCombination="";
        
        findCombinations(denominations, rent, 0, combinations, currentCombination);

		return combinations.size();
	}

    //reccursively find combinations and store unique combinations
	private static void findCombinations(final int[] denominations, final int rent, final int currentRent, final Set<String> combinations,
			final String currentCombination) {
		if (rent == currentRent) {
			final char[] charArr = currentCombination.toCharArray();
			Arrays.sort(charArr);
			combinations.add(new String(charArr));
			return;
		}
		if(currentRent > rent) {
			return;
		}
		for(int i=0;i<denominations.length;i++) {
			findCombinations(denominations, rent, currentRent+denominations[i], combinations, currentCombination+denominations[i]);
		}
	}
	

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        int denominationCount = 0;
        denominationCount = Integer.parseInt(in.nextLine().trim());
        int[] denominations = new int[denominationCount];
        String[] bankNotes =  in.nextLine().split(" ");
        int element;
        for (int i = 0; i < denominationCount; i++) {
            denominations[i] = Integer.parseInt(bankNotes[i]);
        }
        int rent = in.nextInt();
        long result = numberOfWaysToPay(denominations,denominationCount,rent);
        
        System.out.println(result);

    }
}