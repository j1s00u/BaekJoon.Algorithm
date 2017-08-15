package com.java.UseString;

import java.util.Scanner;

public class No_2675 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		String str;
		int R;
		char[] ch = new char[1000];
		for(int i = 0; i < T; i++) {
			 R = scan.nextInt();
			str = scan.next();
			String result ="";
			char arr[] = str.toCharArray();
			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < R; k++) {
					result += arr[j];
				}
			}
			System.out.println(result);
		}
	}
}
		
	
