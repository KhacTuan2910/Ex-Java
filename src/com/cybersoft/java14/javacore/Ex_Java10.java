package com.cybersoft.java14.javacore;

import java.util.Scanner;

public class Ex_Java10 {
	public static void main(String[] args) {
		System.out.print("Enter number: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		var count = 0;
		var num = 2;
		var sum = 0;
		while (count != n) {
            if (isPrime(num)) {
                count++;
                sum += num;
            }
            num++;
        }
		
		System.out.println(sum);
	}

	private static boolean isPrime(int num) {
		if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
	}
}
