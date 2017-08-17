package com.java.FindRegular;

import java.util.Scanner;

public class No_10250 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int H = scan.nextInt();
			int W = scan.nextInt();
			int N = scan.nextInt();
			int count = 0;
			for (int j = 1; j <=W; j++) {
				for (int k = 1; k <=H; k++) {
					count++;
					int result = k*100+j*1;
					if(count==N) {
						System.out.println(result);
					}
				}
			}
		}

	}

}
