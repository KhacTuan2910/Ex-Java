package com.cybersoft.java14.javacore;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = ", i);
			var input = new Scanner(System.in);
			arr[i] = input.nextInt();
		}
		System.out.println("Array: ");
		for (int i : arr) {
			System.out.print(i + ", ");
		}
		System.out.println();
		if(checkEqual(arr)) {
			System.out.println("Perfect array");
		} else {
			System.out.println("NOT Perfect array");
		}
	}

	private static boolean checkEqual(int[] arr) {
		var isEqual = true;
		int i = 0;
		while(isEqual == true && i < arr.length/2) {
			if(arr[i] != arr[9-i]) {
				isEqual = false;
			}
			i++;
		}
		return isEqual;
	}
}
