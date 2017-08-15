package com.java.OneArr;

import java.util.Scanner;

public class No_8958 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		String[] input = new String[count];
		int[] score = new int[count];
		int num = 0;
		for(int i = 0; i < count; i ++) {
			input[i] = scan.next();
		}
		for(int i = 0; i< count;i++) {
			num = 0;
			for(int j = 0; j < input[i].length();j++) {
				char ch = input[i].charAt(j);
				if(ch =='O') {
					num++;
				}
				else{
					num = 0;
				}
				score[i] += num;
			}
			
		}
		for(int i = 0; i < count; i++) {
			System.out.println(score[i]);
		}
	}
}
