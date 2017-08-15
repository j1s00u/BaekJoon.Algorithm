package com.java.UseString;
import java.util.Scanner;
public class No_2941 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		System.out.println(input.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", "1").length());
	}

}
