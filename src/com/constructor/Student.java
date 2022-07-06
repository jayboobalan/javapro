package com.constructor;

public class Student {
	
	public Student() {
	   System.out.println("Default");

	}
	public Student(String name) {
		this();
	    System.out.println(name);
	}
	public Student(int age) {
		this("jay");
	    System.out.println(age);
	}
	public Student(char gender) {
		this(12);
	    System.out.println(gender);
	}
	public Student(long mark) {
		this('M');
		System.out.println(mark);
	}
	public static void main(String[]args) throws Throwable {
		Student s = new Student(988l);
		s.finalize();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
