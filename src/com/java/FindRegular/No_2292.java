 package com.java.FindRegular;

import java.util.Scanner;

public class No_2292 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int result = 1;
		int RootNum = 1;
		int AddNum = 6;
		
		while(true) {
			if(N <= RootNum) {
				break;
			}
			RootNum += AddNum;
			AddNum += 6;
			result++;
		}
		System.out.println(result);
		

	}

}
