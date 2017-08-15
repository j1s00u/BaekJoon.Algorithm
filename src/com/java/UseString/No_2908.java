package com.java.UseString;

import java.util.Scanner;

public class No_2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] num = new int[2];
		int[] result = new int[2];
		for (int i = 0; i < 2; i++) {
			num[i] = scan.nextInt();
			while (num[i] != 0) {
				result[i] = result[i] * 10 + num[i] % 10;
				num[i] /= 10;
			}
		}
		if (result[0] > result[1]) {
			System.out.print(result[0]);
		} else {
			System.out.print(result[1]);
		}

	}

}
