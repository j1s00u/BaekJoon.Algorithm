package com.java.Conditional;

import java.util.Scanner;

public class No_1110 {

	public static void main(String[] args) {
		int num = 0;
		int front_num = 0;
		int last_num = 0;
		int cycle = 0;
		int sum = 0;
		int sum_last=0;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		sum = num;
		while (true) {
			front_num = sum / 10;
			last_num = sum % 10;
			sum_last = (front_num+last_num)%10;
			front_num = last_num;
			last_num = sum_last;
			sum = (front_num*10)+last_num;
			cycle++;
			if(num==sum)break;
		}

		System.out.println(cycle);
	}

}
