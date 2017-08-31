package com.java.PrimeNumber;
import java.util.*;
public class No_1978 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int cnt = 0,num = 0;
		for(int i = 0; i < input; i++) {
			num = scan.nextInt();
			if(num > 1) {
				for(int j = 2; j*j <= num; ++j) {
					if(num%j==0) {
						--cnt;
						break;
					}
				}
				++cnt;
			}
		}
		System.out.println(cnt);
	}

}
