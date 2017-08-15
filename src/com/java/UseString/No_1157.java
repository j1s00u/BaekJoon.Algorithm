package com.java.UseString;

import java.util.Arrays;
import java.util.Scanner;

public class No_1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		String str = input.toUpperCase();
		char ch[] = str.toCharArray();
		int num[] = new int[26];
		int num_sort[] = new int[26];

		for(int i = 0; i < str.length();i++) {
			int count = 0;
			int tmp = ch[i]-65;
			num[tmp]++;
		}
		
		num_sort = Arrays.copyOf(num, 26);
		Arrays.sort(num_sort);
		for(int i = 0; i < 26; i++) {
			if(num_sort[24]==num_sort[25]) {
				System.out.println("?");
				break;
			}
			else if(num_sort[25] == num[i]) {
				System.out.printf("%c",65+i);
			}
		}

	}

}
