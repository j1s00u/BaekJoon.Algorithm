package com.java.PrimeNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_4948 {

	static int max = 123456 * 2;
	static boolean prime[];

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		prime = new boolean[max + 1];
		find();
		StringBuilder sb = new StringBuilder();
		while (true) {
			int num = Integer.parseInt(bf.readLine());//범위 받기
			if (num == 0) { //0을 입력받으면 입력 끝
				System.out.println(sb); //sb 출력
				return;
			}
			int cnt = 0; 
			for (int i = num + 1; i <= num * 2; i++) { //범위안 소수 찾기
				if (i > max)//i 가 max 보다 크면 멈춰라 
					break;
				if (!prime[i]) { //i번째 prime 배열이 소수가 아니면 (true가아니면)
					cnt++; //cnt를 증가시켜라
				}
			}
			sb.append(cnt).append("\n"); //sb에 cnt를 붙여라
		}
	}

	public static void find() {
		prime[1] = true; //참
		for (int i = 2; i <= max; i++) { //2부터 ~ 범위까지
			if (!prime[i]) { //true에 해당하지 않으면..
				for (int j = i + i; j <= max; j += i) { //여기에 해당하면 true 값이 들어감
					prime[j] = true;
				}
			}
		}
	}
}
