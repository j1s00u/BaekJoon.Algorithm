package com.java.PrimeNumber;

import java.util.Scanner;

public class No_2581 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int N = scan.nextInt();
		int sum = 0, cnt = 0, min=10001;
		for (int i = M; i <= N; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					cnt ++;
				}
			}
			if (cnt == 0 && i!=1) {
				sum += i;
				if(min > i)
					min = i;
			}
			cnt=0;
		}
		if(min == 10001) {
			System.out.println("-1");
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		
	}

}
