package com.java.basics;

public class SimpleTest {
	static Integer i=6,j=4,k=9;
	public static void main(String[] args) {
		swapValues(i,j,k);
		System.out.println(k);
	}

	private static void swapValues(Integer i, Integer j, Integer k) {
		if(i==0)
			k=i;
		else
			k=j;
	}
}
