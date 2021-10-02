package com.cybersoft.java14.javacore;

import java.util.Scanner;

public class Ex_Java2 {
	public static void main(String[] args) {
		System.out.print("Enter number: ");
		Scanner input = new Scanner(System.in);
		var number = input.nextInt();
		
		System.out.println("1. Dec to Bin");
		System.out.println("2. Bin to Dec");
		System.out.print("Choice: ");
		var choice = input.nextInt();
		switch(choice) {
			case 1: 
				System.out.println("Dec to Bin -- > " + DectoBin(number));
				break;
			case 2: 
				System.out.println("Bin to Dec -- > " + BintoDec(number));
				break;
		}
	}
	
	private static long DectoBin(int decNumber) {
        long binaryNumber = 0;
        int p = 0;
        while (decNumber > 0)
        {
            binaryNumber += (decNumber % 2) * Math.pow(10, p);
            ++p;
            decNumber /= 2;
        }
        return binaryNumber;
    }
	
	private static int BintoDec(int binaryNumber) {
        int decimal = 0;
        int p = 0;
        while (true) {
            if (binaryNumber == 0) {
                break;
            } else {
                int temp = binaryNumber % 10;
                decimal += temp * Math.pow(2, p);
                binaryNumber /= 10;
                p++;
            }
        }
        return decimal;
    }
}
