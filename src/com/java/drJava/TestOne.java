package com.java.drJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestOne {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
      List<String> magzineSet = new ArrayList<String>(Arrays.asList(magazine));
      List<String> noteSet = new ArrayList<String>(Arrays.asList(note));
      boolean isRansomeNote=true;
      for(String notes:noteSet){
        if(!magzineSet.remove(notes)){
          isRansomeNote=false;
          break;
        }
      }
      if(isRansomeNote){
        System.out.println("Yes");
      }else{
       System.out.println("No");
      } 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
