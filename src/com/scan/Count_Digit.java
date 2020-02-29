package com.scan;

public class Count_Digit {
	public static void main(String[] args) {
		int a = 12567893, count =0;
		//int i =0 ;
		while (a>0) {
			a = a / 10;
			System.out.println(a);
			count++;
		}
	System.out.println(count);
	}
}
