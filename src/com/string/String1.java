package com.string;

public class String1 {

	public static void main(String[] args) {
		
	String s = "Welcome Home" ;
	 
	int d = s.length();
	System.out.println("length : "+d);
	
	int lastindexof = s.lastIndexOf("e");
	System.out.println("lastindexof : " +lastindexof);
	
	String Uppercase = s.toUpperCase();
	System.out.println("touppercase :" +Uppercase);
	 
	String Lowercase = s.toLowerCase();
	System.out.println("tolowercase : "+Lowercase);
	
	boolean contains = s.contains("Welcome Home");
	System.out.println("contains :"+contains);
	
    boolean empty = s.isEmpty();
    System.out.println("empty : "+empty);
     
    String trim = s.trim();
    System.out.println("trim :"+trim);
 
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
