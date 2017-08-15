package com.java.OneArr;
import java.util.Scanner;
public class No_1152 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		int idx = 0;
		String input = scan.nextLine();
		String word="";
		for(int i = 0; i< input.length(); i++) {
			String charc = String.valueOf(input.charAt(i));
			if(charc.equals(" ")) {
					word = "";
			}
			else {
				if(word.length()==0) {
					idx++;
				}
				word = charc;
			}
		}
		
		System.out.println(idx);
	}

}