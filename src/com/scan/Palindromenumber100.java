package com.scan;

public class Palindromenumber100 {
	public static void main(String[] args) {
		
	
	for(int k=0; k<=100; k++) {
		int a=k, n=0;
		int i=0,j=0;
		n=a;
		
		while(a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		if(n==j) {
		System.out.println(j);
		}
			
	}
	}

}
