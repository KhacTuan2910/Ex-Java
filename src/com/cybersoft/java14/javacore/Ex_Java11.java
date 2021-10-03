package com.cybersoft.java14.javacore;

import java.util.Iterator;
import java.util.Scanner;

public class Ex_Java11 {
	public static void main(String[] args) {
		System.out.print("Enter number: ");
		Scanner input = new Scanner(System.in);
		float n = input.nextFloat();
		
		System.out.println(log2(n));
		var temp = Math.floor(log2(n));
		
		if(temp == log2(n)) {
			System.out.println(temp - 1);
		} else {
			System.out.println(temp);
		}
	}
	
	private static float log2(float num) {
		return (float) Math.floor((Math.log(num)/Math.log(2)) * 100) / 100;
	}
}
