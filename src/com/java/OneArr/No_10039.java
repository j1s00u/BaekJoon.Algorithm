package com.java.OneArr;
import java.util.Scanner;
public class No_10039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int avg,sum = 0;
		for(int i  =0; i < 5; i++) {
			num[i] = scan.nextInt();
			if(num[i]<40) {
				num[i] = 40;
			}
		}
		for(int i = 0; i<5; i++) {
			sum += num[i];
		}
		System.out.println(sum/5);

		
		
	}

}
