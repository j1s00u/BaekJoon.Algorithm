package com.java.Sort;

import java.util.*;

public class No_1427 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();
		int[] array = new int[N.length()];
		for (int i = 0; i < N.length(); i++) {
			array[i] = N.charAt(i) - '0';
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = 0;
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}

	}

}
