package com.java.FindRegular;

import java.util.Scanner;

public class No_1193 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();

		int i;
		for(i = 1; X > 0; i++) {
			X=X-i;
		}
		if(i%2 ==1) {
			System.out.print((i+X-1)+"/"+(1-X));
		}
		else if(i%2==0) {
			System.out.print((1-X)+"/"+(i+X-1));
		}
	}

}
