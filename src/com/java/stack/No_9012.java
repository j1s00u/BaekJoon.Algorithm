package com.java.stack;

import java.util.Scanner;

public class No_9012 {
	static int num;
	static String test;
	static int result[];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		num = Integer.parseInt(scan.nextLine());
		result = new int[num];
		
		for(int i = 0; i < num; i++) {
			test = scan.nextLine().trim();
			result[i] = PS(test);
		}
		
		for(int i = 0; i < num; i++) {
			if(result[i] != 0)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
		
	}
	
	static public int PS(String test) {
		int result = 0;
		char[] charArray = test.toCharArray();
		
		for(int i = 0; i <charArray.length;i++) {
			if(result <0)
				return -1;
			if(charArray[i] =='(') {
				result += 1;
				continue;
			}
			
			if(charArray[i] ==')') {
				result -=1;
				continue;
			}
		}
		return result;
	}

}
