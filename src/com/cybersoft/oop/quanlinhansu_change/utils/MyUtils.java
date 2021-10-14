package com.cybersoft.oop.quanlinhansu_change.utils;

public interface MyUtils {
	static void drawLine(int length) {
		for (int i = 0; i < length; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
