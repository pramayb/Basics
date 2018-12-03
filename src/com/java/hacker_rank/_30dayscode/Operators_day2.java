package com.java.hacker_rank._30dayscode;

import java.util.Scanner;

public class Operators_day2 {
	/**
	 * Given the meal price (base cost of a meal), tip percent (the percentage of
	 * the meal price being added as tip), and tax percent (the percentage of the
	 * meal price being added as tax) for a meal, find and print the meal's total
	 * cost.
	 * 
	 * Note: Be sure to use precise values for your calculations, or you may end up
	 * with an incorrectly rounded result!
	 * 
	 * Input Format
	 * 
	 * There are lines of numeric input: The first line has a double, (the cost of
	 * the meal before tax and tip). The second line has an integer, (the percentage
	 * of being added as tip). The third line has an integer, (the percentage of
	 * being added as tax).
	 * 
	 * @param meal_cost
	 * @param tip_percent
	 * @param tax_percent
	 */
	// Complete the solve function below.
	static void solve(double meal_cost, int tip_percent, int tax_percent) {
		double tip = meal_cost * ((double)tip_percent / 100);
		double tax = meal_cost * ((double)tax_percent / 100);
		
		int total_cost = (int) Math.round(meal_cost+tip+tax);
		System.out.println(total_cost);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		double meal_cost = scanner.nextDouble();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int tip_percent = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int tax_percent = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		solve(meal_cost, tip_percent, tax_percent);

		scanner.close();
	}

}
