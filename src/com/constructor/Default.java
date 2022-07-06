package com.constructor;

public class Default {
	
	public Default(String name , int age , char gender , double d , long id ) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(d);
		System.out.println(id);
	}
	public static void main(String[]args) throws Throwable {
		Default d= new Default("jay",15,'m',12.0,5678);
	    d.finalize();
	    }
		
	
	
	
	
	
	
	

}
