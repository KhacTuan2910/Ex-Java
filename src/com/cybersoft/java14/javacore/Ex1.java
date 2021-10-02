package com.cybersoft.java14.javacore;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Ex1 {
	public static void main(String[] args) {
		System.out.print("Enter time zone: ");
		var input = new Scanner(System.in);
		int timeZone = input.nextInt();
		
		getTime(timeZone);
	}
	
	private static void getTime(int timeZone) {
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("HH:mm:ss");

		df.setTimeZone(TimeZone.getTimeZone("GMT+" + timeZone));

		System.out.println("Time in GMT+" + timeZone + ": " + df.format(date));
	}

}
