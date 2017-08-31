package com.java.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;

public class No_2504 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out));
		String line = br.readLine();

		bw.write(f(line) + "\n");
		bw.flush();
	}

	private static int f(String line) {
		Stack<Character> stack = new Stack<>();
		int mul = 1;// 공통 곱하기 변수
		int sum = 0;// 더하기 변수
		int n = 0; // (괄 호의 개수를 셈
		int m = 0; // [괄호의 개수를 셈
		int len = line.length();

		for (int i = 0; i < len; i++) {
			char a = line.charAt(i);
			if (a == '(') {
				n++; //'(' 추가
				stack.push(a);//스택에 push
				mul *= 2; //공통이 될 수 있으니 *2
				if (i + 1 < len && line.charAt(i + 1) == ')') { //다음 char이 )이면 
					sum += mul; //sum에 mul을 더하기
				}
			} else if (a == '[') { 
				m++;//'[' 추가
				stack.push(a); //스택에 푸시
				mul *= 3;//공통이 될 수 있으니 *3
				if (i + 1 < len && line.charAt(i + 1) == ']') { //다음 char이 ]이면
					sum += mul; //sum에 mul을 더하기
				}
			} else if (a == ')') { 
				n--; //')'입력받으면 
				stack.pop(); //pop
				mul /= 2; //본래 mul에서 2나누기
			} else if (a == ']') {
				m--;
				stack.pop();
				mul /= 3;
			}
		}
		if (!stack.empty() || n != 0 || m != 0)
			return 0;
		return sum;
	}
}
