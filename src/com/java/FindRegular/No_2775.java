package com.java.FindRegular;
import java.util.Scanner;
public class No_2775 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] room = new int[15][15];
		int T = scan.nextInt();
		
		for(int i = 1; i<=14; i++) {
			room[0][i]=i;
		}
		for(int i = 1; i<=14; i++) {
			for(int j = 1; j <=14; j++){
				for(int k = 1; k<=j;k++) {
					room[i][j] += room[i-1][k];
				}
			}
		}
		
		for(int i = 0; i < T; i++) {
			int k  = scan.nextInt();
			int n = scan.nextInt();
			System.out.println(room[k][n]);
		}
		
		
	}

}
