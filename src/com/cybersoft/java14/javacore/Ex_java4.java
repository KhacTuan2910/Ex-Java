package com.cybersoft.java14.javacore;

import java.util.Scanner;

public class Ex_java4 {
	public static void main(String[] args) {
		System.out.print("Enter number: ");
		Scanner input = new Scanner(System.in);
		var number = input.nextInt();
		
		int sum = 0;
		var temp = number;
		while (temp != 0) {
			sum += temp % 10;
			temp /= 10;
		}
		
		System.out.println("Sum: " + sum);
	}
}
