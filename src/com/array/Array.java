package com.array;

public class Array {

	public static void main(String[] args) {
		
		int a []= new int[8];
		
		a[0]=40;
		a[1]=30;
		a[2]=45;
		a[3]=25;
		a[4]=60;
		a[5]=32;
		a[6]=56;
		a[7]=70;
		
		for (int i = 0; i < 8; i++) {
			
			System.out.println("values of "+i+ "="+a[i]);
		}
	}
}
