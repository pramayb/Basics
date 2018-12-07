package com.java.hacker_rank._30dayscode;

import java.util.Scanner;

public class Day04_Person {
	private int age;

	public Day04_Person(int initialAge) {
		// Add some more code to run some checks on initialAge
		if (initialAge > 0) {
			age = initialAge;
		} else {
			System.out.println("Age is not valid, setting age to 0.");
			age = 0;
		}
	}

	public void amIOld() {
		// Write code determining if this person's age is old and print the correct
		// statement:
		if (age < 13) {
			System.out.println("You are young.");
		} else if (age >= 13 && age < 18) {
			System.out.println("You are a teenager.");
		} else {
			System.out.println("You are old.");
		}
	}

	public void yearPasses() {
		// Increment this person's age.
		age+=1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Day04_Person p = new Day04_Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		sc.close();
	}
}