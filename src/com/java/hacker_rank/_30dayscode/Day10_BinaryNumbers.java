package com.java.hacker_rank._30dayscode;

import java.util.Scanner;

public class Day10_BinaryNumbers {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
//		int k=n;
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		String binary="";
//		long currentTimeMillis;
//		currentTimeMillis = System.currentTimeMillis();
		while(n>=1) {
			binary = n%2+binary;
			n=n/2;
		}

//		System.out.println("loops: "+(System.currentTimeMillis()-currentTimeMillis));
//		System.out.println(binary);
	
//		//Some Inbuilt methods by Java
//		currentTimeMillis = System.currentTimeMillis();
//		binary=Integer.toString(k, 2);
//		System.out.println("Integer.toString: "+(System.currentTimeMillis()-currentTimeMillis));
//		System.out.println(binary);
//
//		currentTimeMillis = System.currentTimeMillis();
//		binary=Integer.toBinaryString(k);
//		System.out.println("Integer.toBinaryString: "+(System.currentTimeMillis()-currentTimeMillis));
//		System.out.println(binary);
		
		int currentCounter=0;
		int maxCounter=0;
		
		for(int i=0;i<binary.length();i++) {
			if(binary.charAt(i)=='1'){
				currentCounter+=1;
			}else {
				currentCounter=0;
			}
			if(currentCounter>maxCounter) {
				maxCounter=currentCounter;
			}
		}
		
		System.out.println(maxCounter);
		scanner.close();
	}
}
