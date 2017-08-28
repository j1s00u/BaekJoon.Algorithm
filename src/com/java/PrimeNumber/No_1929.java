package com.java.PrimeNumber;

import java.util.Scanner;

//에라토스테네스의 체
//주어진 자연수 N이 소수이기 위한 필요 충분조건은 N이 N의 제곱근보다 크지 않은 어떤 소수로도 나눠지지 않는다.
//수가 수를 나누면 몫이 발생하게 되는데 몫과 나누는 수, 둘 중 하나는 반드시 루트 N이하이기 때문
public class No_1929 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int N = scan.nextInt();
		int[] array = new int[1000001];
		
		for(int i = 2; i <array.length;i++) {
			array[i] =i;
		}
		
		for(int i = 2; i <array.length; i++) {
			if(array[i] == 0)
				continue;
			for(int j = i+i; j<array.length; j+=i) {
				array[j] = 0;
			}
		}
		for(int i = M; i<=N; i++) {
			if(array[i] !=0)
				System.out.println(array[i]);
		}

	}

}
