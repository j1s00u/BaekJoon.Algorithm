package com.java.Sort;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Comparator;

public class No_1181 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i, j, n = Integer.parseInt(br.readLine()), len, tmp, size;

		HashSet<String> hs = new HashSet<>();
		for (i = 0; i < n; i++)
			hs.add(br.readLine());
		size = hs.size();
		String arr[] = new String[size];
		hs.toArray(arr);

		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		});

		for (i = 0; i < size; i++) {
				len = arr[i].length();
				for(j=i+1;j<size;j++) {
					tmp = arr[j].length();
					if(len !=tmp) break;
				}
				Arrays.sort(arr,i,j);
				i = j -1;
		}
		
		for(i = 0; i < size; i++)
			System.out.println(arr[i]);
		br.close();
	}

}
