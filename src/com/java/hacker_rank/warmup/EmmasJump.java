package com.java.hacker_rank.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EmmasJump {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jump=0;
        for(int i=0;i<c.length;){
            if(c.length > i+2 && c[i+2]==0){
                jump+=1;
                if(i+2 < c.length)
                	i+=2;
                else
                	i+=1;
            }else if(c.length > i+1 && c[i+1]==0){
                jump+=1;
                i+=1;
            }else {
            	i++;
            }
        }
        return jump;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        System.out.println(result);
        scanner.close();
    }
}
