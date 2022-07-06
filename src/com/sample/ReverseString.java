package com.sample;

import java.util.Scanner;

public class ReverseString 
{
	
	public static void main(String[] args) {
		ReverseString rs =new ReverseString();
		rs.reverse();
	}
	private void reverse() {
		@SuppressWarnings("resource")
		Scanner  s =new Scanner(System.in);
		System.out.println(" name ");
		String name= s.nextLine();
		String[] str = name.split(" ");
		for (int length=str[0].length()-1; length >=0; length--) 
		{
		
	
		    System.out.print(str[0].charAt(length));
			
		
		}
		System.out.print(" " +str[1]);
}
}