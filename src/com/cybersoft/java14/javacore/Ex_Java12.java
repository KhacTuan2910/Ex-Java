package com.cybersoft.java14.javacore;

import java.util.Scanner;

public class Ex_Java12 {
	public static void main(String[] args) {
		System.out.print("Enter number(1-9): ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
//		1 <= n <= 9
		
		for (var i = 1; i <= n; i++) {
			for (var j = 1; j <= i; j++) {
				System.out.print(" " + j + " ");
			}
			System.out.println();
		}
	}
}
