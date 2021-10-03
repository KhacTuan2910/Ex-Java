package com.cybersoft.java14.javacore;

import java.util.Scanner;

public class Ex_Java15 {
	public static void main(String[] args) {
		System.out.print("Enter string: ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		var lenStr = str.length();
		System.out.println(lenStr);
		
		System.out.println(str.charAt(1));
		
		System.out.println(str.contains("abcdef"));
	}
}
