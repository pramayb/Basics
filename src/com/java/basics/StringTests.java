package com.java.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringTests {
	public static void main(String[] args) {
//		if(checkDuplicateCharacter("absa")) {
//			System.out.println("has duplicate");
//		}else {
//			System.out.println("no duplicate");
//		}
		test();
	}
	
	private static void test() {
		List<String> tstLst = new ArrayList<String>();
		tstLst.add("A");
		tstLst.add("C");
		tstLst.add("D");
		tstLst.add("B");
		tstLst.add("E");
		tstLst.add("AB");
		
		List<String> collect = tstLst.stream().map(value -> value = value.concat(" Hi!")).collect(Collectors.toList());
		System.out.println(tstLst);
		System.out.println(collect);
	}
	
	public static boolean checkDuplicateCharacter(String stringToTest) {
		boolean [] alphaArray = new boolean[26];
		for(int i=0;i<=stringToTest.length()-1;i++) {
			int pointVal = Character.getNumericValue(stringToTest.charAt(i));
			if(alphaArray[pointVal-10]) {
				return true;
			}else {
				alphaArray[pointVal-10]=true;
			}
		}
		return false;
	}

}
