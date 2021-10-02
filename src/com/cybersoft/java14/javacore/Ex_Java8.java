package com.cybersoft.java14.javacore;

import java.util.Scanner;

public class Ex_Java8 {
	public static void main(String[] args) {
		System.out.print("Enter string: ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		var strTrim = str.trim();
		System.out.println(strTrim);
		
		String[] arr = strTrim.split(" ");

		String stringChanged = "";
		for (String x : arr) {
			stringChanged = stringChanged + (x.substring(0, 1).toUpperCase() + x.substring(1));
			stringChanged = stringChanged + " ";
		}
		
		System.out.println(stringChanged);
	}
}
