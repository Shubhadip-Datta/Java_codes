package com.example.myapp;

class student {
	String name;
	int age;
	
	// constructor
	student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	// copy constructor
	student(student s) {
		this.name = s.name;
		this.age = s.age;
	}
}

public class Main {

	public static void main(String[] args) {
		student s1 = new student("Dip",21);
		student s2 = new student(s1);
		
		System.out.println("Original object: " + s1.name + "," + s1.age);
		System.out.println("Copy object: " + s2.name + "," + s2.age);
		

	}

}
