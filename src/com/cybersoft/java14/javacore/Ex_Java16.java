package com.cybersoft.java14.javacore;

import java.util.Scanner;

public class Ex_Java16 {
	public static void main(String[] args) {
		System.out.print("Enter year(yyyy): ");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		
		if(year % 4 == 0) {
			System.out.println("Nam Nhuan");
		} else {
			System.out.println("Khong phai Nam Nhuan");
		}
	}
}
