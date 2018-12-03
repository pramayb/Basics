package com.java.hacker_rank.warmup;

import java.io.IOException;
import java.util.Scanner;

public class LilahsRepeatedString {
	// Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	long counter=0;
    	long originalCounter=0;
    	long original = s.length();
    	
    	if(s.length()==1)
    	{
    		if(s.charAt(0)=='a')
    			return n;
    		else
    			return 0;
    	}
    		
    	
    	for(int i=0;i<original && i<n;i++) {
    		if(s.charAt(i)=='a')
    		{
    			originalCounter++;
    		}
    	}
    	
    	long divisor = n/original;
    	counter = divisor*originalCounter;
    	
    	long remaining = n%original;
    	
		for (int i = 0; i < remaining && i < n; i++) {
			if (s.charAt(i) == 'a') {
				counter++;
			}
		}
    	
    	return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(result);
        scanner.close();
    }
}
