package com.java.Conditional;

import java.util.Scanner;

public class No_4344 {

	private static Scanner scan;

	public static void main(String[] args) {

		double sum = 0;
		double avg = 0;
		double stud_count = 0;
		scan = new Scanner(System.in);
		int total_list = scan.nextInt();
		int[][] score = new int[total_list][];

		for (int i = 0; i < total_list; i++) {
			int stu_num = scan.nextInt();
			score[i] = new int[stu_num];
			for (int j = 0; j < stu_num; j++) {
				score[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < total_list; i++) {
			sum = 0;
			avg = 0;
			stud_count = 0;
			for (int j = 0; j < score[i].length; j++) {
				avg = (sum += score[i][j]) / score[i].length;

			}
			for (int j = 0; j < score[i].length; j++) {
				if (avg < score[i][j])
					stud_count++;
			}
			System.out.format("%.3f%% \n", (double) ((stud_count * 100) / (score[i].length)));
		}
	}
}