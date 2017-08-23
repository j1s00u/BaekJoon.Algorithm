package com.java.Sort;

import java.util.*;

public class No_2108 {

	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	int N= scan.nextInt();
	int[] array = new int[8001];
	int mid = 0 ,common =0;
	boolean bool_common = false, bool_mid = false;
	int max = -4000, min = 4000;
	float ave = 0;
	for(int i = 0; i < N; i++)
	{
		int input = scan.nextInt();
		ave +=(float)input;
		++array[input+4000];
		max = (input > max) ? input:max;
		min = (input < min) ? input:min;
	}
	ave /=(float)N;
	ave =Math.round(ave);
	mid = array[0];
	for(int i = 1; i < 8001; i++) {
		if(!bool_mid)
			if(mid > N/2) {
				bool_mid = true;
				mid = i-4001;
			}
			else {
				mid += array[i];
			}
		if(array[i]>array[common])
		{
			bool_common  = false;
			common = i;
		}
		else if(array[i] == array[common])
			if(!bool_common)
			{
				bool_common = true;
				common = i;
			}
	}
	common -=4000;
	
	System.out.printf("%d\n%d\n%d\n%d",(int)ave,mid,common,(max-min));	
	}
}
