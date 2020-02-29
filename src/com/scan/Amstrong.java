package com.scan;

public class Amstrong {
	public static void main(String[] args) {
		int a=153, n=0;
		int i=0,j=0;
		n=a;
		while(a>0) {
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
			System.out.println(j);
					
		}
		if(n==j) {
			System.out.println("amstrong number");
		}else {
			System.out.println(("not amstrong number"));
		}
		
	}

}
