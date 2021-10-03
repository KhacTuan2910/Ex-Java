package com.cybersoft.java14.javacore;

import java.util.Scanner;

public class Ex_java17 {
	public static void main(String[] args) {
		var rand = Math.round(Math.random() * 1000);
		
		while(rand == 0) {
			rand = Math.round(Math.random() * 1000);
		}
		System.out.println(rand);
		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.print("Enter number(1-1000): ");
			
			n = input.nextInt();
			
			if(n == rand) {
				System.out.println("Done!");
			} else if(n > rand) {
				System.out.println("n > rand");
			} else {
				System.out.println("n < rand");
			}
		} while(n != rand);
	}
}
