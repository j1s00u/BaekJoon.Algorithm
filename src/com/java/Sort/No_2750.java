package com.java.Sort;

import java.util.Scanner;

public class No_2750 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int[] arr = new int[input];
		for (int i = 0; i < input; i++) {
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				if (arr[i] < arr[j]) {
					int tmp = 0;
					tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}

		for (int i = 0; i < input; i++) {
			System.out.println(arr[i]);
		}
	}

}
