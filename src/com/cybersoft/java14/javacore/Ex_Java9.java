package com.cybersoft.java14.javacore;

import java.util.Scanner;

public class Ex_Java9 {
	public static void main(String[] args) {
		System.out.print("Enter number: ");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		input.nextLine();
		
//		(10 <= {num1, num2} <= 99)
		var numStr = "" + num1/10 + num1 % 10 + num2/10 + num2%10;
		var result = false;
		if(numStr.charAt(0) == numStr.charAt(2) 
				|| numStr.charAt(0) == numStr.charAt(3)
				|| numStr.charAt(1) == numStr.charAt(2) 
				|| numStr.charAt(1) == numStr.charAt(3)) {
			result = true;
		}
		
		if(result) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}
}
