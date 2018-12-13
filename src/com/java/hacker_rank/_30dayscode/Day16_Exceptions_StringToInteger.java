package com.java.hacker_rank._30dayscode;

import java.util.Scanner;

public class Day16_Exceptions_StringToInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
        	System.out.println(Integer.parseInt(S));
        }catch(NumberFormatException e) {
        	System.out.println("Bad String");
        }finally {
        	in.close();
        }
    }
}
