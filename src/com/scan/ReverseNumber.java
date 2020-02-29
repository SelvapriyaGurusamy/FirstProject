package com.scan;

public class ReverseNumber {
	public static void main(String[] args) {
		int a = 123;
		int i,j = 0;
		while(a>0) {
			i=a%10;
			System.out.println(i);
			j=(j*10)+i;
			System.out.println(j);
			a=a/10;
			System.out.println(a);
						
		}
		System.out.println(j);
		
	}

}
