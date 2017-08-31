package com.java.PrimeNumber;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_9020 {
	public static final int SIZE = 10001;
	public static boolean isNotPrime[] = new boolean[SIZE];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		Eratosthenes();
		StringBuilder result = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			result.append(goldBach(Integer.parseInt(br.readLine())));
		}
		out.write(result.toString());
		out.close();
		br.close();
	}

	private static String goldBach(int n) {
		int i, j, mid = n >>> 1; // unsigned 오른쪽으로 이동
		for (i = j = mid; i <= n; i--, j++)
			if (!isNotPrime[i] && !isNotPrime[j])// true가 아니라면 둘다..
				break;
		return String.format("%d %d\n", i, j);
	}

	private static void Eratosthenes() {
		int i, j;
		for (i = 2; i * i < SIZE; i++) {
			if (!isNotPrime[i]) // i번째 isNotPrime 배열이 false라면
				for (j = i * i; j < SIZE; j += i) // j -> 소수구하기
					isNotPrime[j] = true; // 소수가 아니라면 true
			isNotPrime[1] = true;
		}
	}

}
