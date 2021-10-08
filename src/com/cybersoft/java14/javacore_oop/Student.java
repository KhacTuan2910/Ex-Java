package com.cybersoft.java14.javacore_oop;

public class Student {
	private int id;
	private String name;
	private int age;
	private String address;
	private float gpa;
	

    // constructor
    public Student() {
        name = "";
        id = 0;
        age = 0;
        gpa = 0.0f;
    }

    public Student(int studentId, String fullName, float finalGrade, int age) {
        this.name = fullName;
        this.id = studentId;
        this.gpa = finalGrade;
        this.age = age;
    }

    // getter and setter
    public int getId() {
        return id;
    }

    public void setId(int studentId) {
        this.id = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String fullName) {
        this.name = fullName;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public float getGpa() {
        return gpa;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
