package com.java.UseString;

import java.util.Arrays;
import java.util.Scanner;

public class No_10809 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s= scan.next();
		char[] input = s.toCharArray(); 
		int[] num = new int[26];
		Arrays.fill(num, -1);
		for(int i = 0; i<input.length;i++) {
			int tmp = input[i]-97;
			if(num[tmp]==-1)
				num[tmp]=i;
		}
		
		for(int i = 0; i < num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}

}
