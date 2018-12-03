package com.java.crossover;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;


public class RecipeRemainder {
  /**
   * Complete the function below.And make sure to include required imports
   * DONOT MODIFY anything outside this function!
   */
  static int[]  calculateRemainders(int[] proportions,int[] availableGrams) {
    int[] remaining_grams=new int[availableGrams.length];
    int minimumPart = 0;
    //find minimum amount of recipe part for availabeGrams
    //loop each proportion
    //if minimum part is greater than proportion distribution replace with new minimum value
    for(int i=0;i<proportions.length;i++) {
    	if(minimumPart == 0 || minimumPart > availableGrams[i]/proportions[i])
    		minimumPart = availableGrams[i]/proportions[i];
    }

    //take out minimum amount part from each available grams
    for(int i=0;i<availableGrams.length;i++) {
    	//remaining is the remainder
    	remaining_grams[i]=Math.abs(availableGrams[i]-minimumPart*proportions[i]);
    }

    return remaining_grams;

  }
  
  /**
   * DO NOT MODIFY THIS METHOD!
   */
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int[] proportions = Arrays.stream(in.nextLine().split(", ")).mapToInt(Integer::valueOf).toArray();
      int[] availableGrams = Arrays.stream(in.nextLine().split(", ")).mapToInt(Integer::valueOf).toArray();
      
      int[] remainder = calculateRemainders(proportions,availableGrams);
      
      System.out.println(Arrays.stream(remainder)
                         .mapToObj(String::valueOf)
                         .collect(Collectors.joining(", ")));
   }
}
