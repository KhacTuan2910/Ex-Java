package com.cybersoft.java14.javacore;

import java.util.Scanner;

public class Ex_Java7 {
	public static void main(String[] args) {
		System.out.print("Enter number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.print(i + "   ");
			}
		}
	}
}
