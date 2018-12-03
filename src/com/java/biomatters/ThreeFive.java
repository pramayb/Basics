package com.java.biomatters;

import java.util.LinkedList;
import java.util.List;

public class ThreeFive {
	static List<String> doThreeFive(int max) {
		List<String> numberList = new LinkedList<>();
		for(int i=1;i<=max;i++) {
			if(i%15==0) {
				numberList.add("threefive");
			}else if(i%5==0) {
				numberList.add("five");
			}else if(i%3==0) {
				numberList.add("three");
			}else {
				numberList.add(String.valueOf(i));
			}
		}
		return numberList;
	}
	
	public static void main(String[] args) {
		System.out.println(doThreeFive(1));
	}
}
