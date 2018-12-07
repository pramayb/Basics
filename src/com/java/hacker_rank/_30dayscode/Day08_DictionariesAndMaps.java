package com.java.hacker_rank._30dayscode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day08_DictionariesAndMaps {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> phoneBook = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			phoneBook.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			Integer phone = phoneBook.get(s);
			if (phone == null)
				System.out.println("Not found");
			else
				System.out.println(s + "=" + phone);
		}
		in.close();
	}
}
