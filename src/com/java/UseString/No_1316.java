package com.java.UseString;

import java.util.Scanner;

public class No_1316 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String[] input = new String[N];
		int num[] = new int[26];
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			input[i] = scan.next();
			int count = 0;
			for (int j = 0; j < input[i].length(); j++) {
				if (num[input[i].charAt(j) - 97] >= 1 && input[i].charAt(j) != input[i].charAt(j - 1) && j != 0) {
					count = 1;
					break;
				}
				num[input[i].charAt(j) - 97]++;
			}
			if (count == 0) {
				cnt++;
			}
			for (int k = 0; k < 26; k++) {
				num[k] = 0;
			}
		}
		System.out.println(cnt);

	}

}
