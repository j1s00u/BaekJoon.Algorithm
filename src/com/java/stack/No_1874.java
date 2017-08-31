package com.java.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1874 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i,k,n = Integer.parseInt(br.readLine()), max = 0, stIdx = 0; 
		int stack[] = new int[n]; //stack을 입력 받은 n만큼 구성 
		StringBuilder sb = new StringBuilder(); 
		while(n-- > 0) {
			k = Integer.parseInt(br.readLine()); //스택에서 뽑을 수열 
			if(k>max) //k가 max 보다 크면 
				for(i = max; i < k; i++) { 
					stack[stIdx++] = i+1;
					/*k가 4라면,
					 * stack[1] = 2;
					 * stack[2] = 3;
					 * stack[3] = 4;
					 */
					sb.append("+\n"); //push..
				}
			else
				if(stack[stIdx-1] !=k) { //스택 top이 바로 k가 아니면 
					System.out.print("NO"); return;
				}
			stIdx--; //4까지 push한 뒤 4를 꺼내기 위해 pop 
			sb.append("-\n"); //pop...
			if(k>max) max = k; //top은 k..
		}
		System.out.println(sb);

	}

}
