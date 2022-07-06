package com.sample;

public class Maximimi {
	public static void main(String[] args) {
		int numbers[]=new int[] {8,9,10,6,5,4,2};
		int s = numbers[0];
		int l = numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {
		
			if (numbers[i]>l)l=numbers[i];
			else if (numbers[i]<s)s=numbers[i];
		}
		System.out.println("largest number is:"+l);
		System.out.println("smallest number is:"+s);
		
		
	}

}
