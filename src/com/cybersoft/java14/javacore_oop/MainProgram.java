package com.cybersoft.java14.javacore_oop;

import java.util.Scanner;

import com.cybersoft.java14.javacore_oop.object.Rectangle;

public class MainProgram {
	public static void main(String[] args) {
		System.out.println("Enter width and height:");
		Scanner input = new Scanner(System.in);
		var width = input.nextInt();
		var height = input.nextInt();
		
		Rectangle rect = new Rectangle(width, height);
		
		System.out.println("Area: " + rect.getArea());
		System.out.println("Perimeter: " + rect.getPerimeter());
	}
}
