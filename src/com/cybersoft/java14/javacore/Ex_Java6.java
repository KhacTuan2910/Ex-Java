package com.cybersoft.java14.javacore;

import java.util.Scanner;

public class Ex_Java6 {
	public static void main(String[] args) {
		System.out.print("Enter string: ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		var strTrim = str.trim();
		System.out.println(strTrim);
		
		for (int i = strTrim.length() - 1; i >= 0; i--) {
			System.out.print(strTrim.charAt(i));			
		}
	}
}
