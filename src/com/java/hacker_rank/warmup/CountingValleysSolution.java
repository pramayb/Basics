package com.java.hacker_rank.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingValleysSolution {
	// Complete the countingValleys function below.
	static int countingValleys(int n, String s) {
		//D should be less than U means one dip
		boolean belowSea=false;
		int valleyCounter=0;
		int valleyLevel=0;
		
		for(int i=0;i<n;i++) {
            char slope = s.charAt(i);
            if(slope == 'U')//Uphill
            	valleyLevel++;
            else//Downhill
            	valleyLevel--;
            
            if(!belowSea && valleyLevel < 0)
            {
            	valleyCounter++;
                belowSea = true;
            }
            
            if(valleyLevel >= 0)//We are back above sea level
                belowSea = false;
		}
		return valleyCounter;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		String s = scanner.nextLine();

		int result = countingValleys(n, s);

		System.out.println(result);
		scanner.close();
	}

}