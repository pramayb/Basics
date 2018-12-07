package com.java.hacker_rank._30dayscode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Difference {
	private int[] elements;
	public int maximumDifference;

	public Difference(int[] a) {
		this.elements = a;
	}

	// Add your code here
	public void computeDifference() {
//		findMaxDiffUsingRecurrsion();
		findMaxDiffUsingDPP();
	}

	private void findMaxDiffUsingRecurrsion() {
		for (int i = 0; i < elements.length; i++) {
			findMaxDiffRecurrsion(i, elements);
		}
	}

	private void findMaxDiffUsingDPP() {
		Set<Integer[]> check = new HashSet<>();
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length; j++) {
				Integer[] r = new Integer[] { i, j };
				Arrays.sort(r);
				if (check.add(r)) {
					int diff = Math.abs(elements[i] - elements[j]);
					if (diff > maximumDifference)
						maximumDifference = diff;
				}
			}
		}
	}

	private void findMaxDiffRecurrsion(int elem, int[] elements2) {
		if (elem++ >= elements2.length - 1)
			return;

		for (int i = 0; i < elements2.length; i++) {
			int diff = Math.abs(elements2[elem] - elements2[i]);

			if (diff > maximumDifference)
				maximumDifference = diff;

			findMaxDiffRecurrsion(elem, elements);
		}
	}
}

public class Day14_Scope {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);
		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}