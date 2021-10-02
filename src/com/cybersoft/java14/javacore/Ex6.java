package com.cybersoft.java14.javacore;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		System.out.print("Enter string: ");
		Scanner input = new Scanner(System.in);
		var str1 = input.nextLine();
		var str2 = input.nextLine();
		
		if(checkEqual(str1, str2)) {
			System.out.println("Equal");
		} else if(checkEqualIgnoreCase(str1, str2)) {
			System.out.println("Equal ignore case");
		} else {
			System.out.println("NOT Equal");
		}
	}
	
	private static boolean checkEqual(String str1, String str2) {
		var isEqual = false;
		if(str1.compareTo(str2) == 0) {
			isEqual = true;
		}
		return isEqual;
	}
	
	private static boolean checkEqualIgnoreCase(String str1, String str2) {
		var isEqual = false;
		if(str1.compareToIgnoreCase(str2) == 0) {
			isEqual = true;
		}
		return isEqual;
	}
}
