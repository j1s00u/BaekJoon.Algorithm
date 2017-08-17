package com.java.FindRegular;

import java.util.Scanner;

public class No_1475 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.next();
		int [] num = new int[10];
		
		for(int i = 0; i < N.length(); i++) {
			num[N.charAt(i)-'0']++;
		}
		int sN = num[6] + num[9];
		sN = (sN/2) + (sN%2);
		for(int i = 0; i < 10; i++) {
			if(i !=6 && i != 9)
				sN = Math.max(sN, num[i]);
		}
		System.out.println(sN);
	}

}
