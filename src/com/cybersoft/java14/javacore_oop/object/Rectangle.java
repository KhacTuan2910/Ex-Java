package com.cybersoft.java14.javacore_oop.object;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int height) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getPerimeter() {
		return (height + width) * 2;
	}
	
	public int getArea() {
		return (height * width);
	}
}
