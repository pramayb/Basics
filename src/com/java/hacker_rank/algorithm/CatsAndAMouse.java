package com.java.hacker_rank.algorithm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CatsAndAMouse {
	// Complete the catAndMouse function below.
	static String catAndMouse(int x, int y, int z) {
		int catADistance = x>z?x-z:z-x;
		int catBDistance = y>z?y-z:z-y;
		if(catADistance > catBDistance) {
			return "Cat B";
		}else if(catADistance < catBDistance)
		{
			return "Cat A";
		}else {
			return "Mouse C";
		}
	}

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		int i=1;
		if(i++ == --i)
			System.out.println(0);
		else
			System.out.println(1);
//		int q = scanner.nextInt();
//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//		for (int qItr = 0; qItr < q; qItr++) {
//			String[] xyz = scanner.nextLine().split(" ");
//
//			int x = Integer.parseInt(xyz[0]);
//
//			int y = Integer.parseInt(xyz[1]);
//
//			int z = Integer.parseInt(xyz[2]);
//
//			String result = catAndMouse(x, y, z);
//			System.out.println(result);
//		}
//
//		scanner.close();
	}
}
