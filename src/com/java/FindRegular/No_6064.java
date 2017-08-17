package com.java.FindRegular;

import java.util.Scanner;

public class No_6064 {

	public static int lcm(int m, int n) {
		int tmp, a, b;
		a = m;
		b = n;
		while (true) {
			tmp = a % b;
			if (tmp == 0)
				break;
			a = b;
			b = tmp;
		}
		return (m * n) / b;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int m = scan.nextInt();
			int n = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			int lcm = lcm(m,n);
			while(x!=y && x<=lcm) {
				if(x<y) x+=m;
				else y+=n;
			}
			if(x!=y) System.out.println("-1");
			else System.out.println(x);
		}
	}
	

}
