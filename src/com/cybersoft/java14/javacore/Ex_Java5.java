package com.cybersoft.java14.javacore;

import java.util.Scanner;

public class Ex_Java5 {
	public static void main(String[] args) {
		System.out.println("Enter: ");
		Scanner input = new Scanner(System.in);
		System.out.print("A: ");
		var xA = input.nextInt();
		var yA = input.nextInt();
		System.out.print("B: ");
		var xB = input.nextInt();
		var yB = input.nextInt();
		
		float distance = (float) Math.sqrt(Math.pow((xA - xB), 2) + Math.pow((yA - yB), 2));
		System.out.println("Distance: " + distance);
	}
}
