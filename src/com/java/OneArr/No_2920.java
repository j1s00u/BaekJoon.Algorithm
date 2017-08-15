package com.java.OneArr;
import java.util.Scanner;
public class No_2920 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] input = new int[8];
		int acount = 0,dcount =0;
		
		for(int i = 0; i < 8; i++) {
			input[i] = scan.nextInt();
			if(input[i] == i+1) {
				acount++;
			}
			else if(input[i] == 8-i) {
				dcount++;
			}
		}
		if(acount==8) {
			System.out.println("ascending");
		}
		else if(dcount==8) {
			System.out.println("descending");
		}
		else if(acount !=8&&dcount !=8){
			System.out.println("mixed");
		}
		
	}

}
