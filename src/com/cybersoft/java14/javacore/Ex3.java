package com.cybersoft.java14.javacore;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		System.out.print("Enter number: ");
		Scanner input = new Scanner(System.in);
		var num = input.nextInt();
		var amount = countAmount(num);
		System.out.print("Amount number: " + amount);
	}

	private static int countAmount(int num) {
		int count = 0;
		do {
			count++;
			num/=10;
			System.out.println(num);
		} while(num != 0);
		return count;
	}
}
