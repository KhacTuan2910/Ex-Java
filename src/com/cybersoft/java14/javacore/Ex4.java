package com.cybersoft.java14.javacore;

import java.util.Iterator;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		System.out.print("Enter number: ");
		Scanner input = new Scanner(System.in);
		var n = input.nextInt();
		
		float sum = 0f;
		for (int i = 1; i <= n; i++) {
			sum += 1.0/(i*(i+1)*(i+2));
			System.out.println("Sum: " + sum);
		}
		System.out.print("Sum: " + sum);
	}
}
