package com.java.OneArr;
import java.util.Scanner;
public class No_2577 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int multi = 0;
		int[] num = new int[10];
		multi = A * B * C;
		String mul = String.valueOf(multi);

		for(int i = 0; i < mul.length(); i ++) {
			char s = mul.charAt(i);
				switch((int)s - 48){
				case 0: num[0]++; break;
				case 1: num[1]++; break;
				case 2: num[2]++; break;
				case 3: num[3]++; break;
				case 4: num[4]++; break;
				case 5: num[5]++; break;
				case 6: num[6]++; break;
				case 7: num[7]++; break;
				case 8: num[8]++; break;
				case 9: num[9]++; break;		
				}		
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(num[i]);
		}

	}
}