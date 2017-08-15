package com.java.Func;

public class No_4673 {

	public static int d(int idx) {
		int result = idx;
		if(idx>=10000) {
			result += idx/10000;
			idx %=10000;
		}
		if(idx >=1000) {
			result += idx/1000;
			idx %= 1000;
		}
		if(idx >=100) {
			result += idx/100;
			idx %=100;
		}
		if(idx >=10) {
			result += idx/10;
			idx %=10;
		}
		return result += idx;
	}
	
	public static void main(String[] args) {
	
		int arr[] = new int[100036];
		for(int i = 1; i <=10000; i++) {
			arr[d(i)] = 1;
			if(arr[i]!=1) System.out.println(i);
		}
	
		
	}

}
