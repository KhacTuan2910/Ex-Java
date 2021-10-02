package com.cybersoft.java14.javacore;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		System.out.print("Enter 3 number: ");
		Scanner input = new Scanner(System.in);
		var num1 = input.nextInt();
		var num2 = input.nextInt();
		var num3 = input.nextInt();
		input.nextLine();
		checkSort(num1, num2, num3);
	}

	private static void checkSort(int num1, int num2, int num3) {
		if(num2 >= num1 && num3 >= num2) {
			System.out.print("Sorted in ascending order");
		} else if(num1 > num2 && num2 > num3) {
			System.out.print("Sorted in descending order");
		} else {
			System.out.print("Unsorted");
		}
		
	}
}
