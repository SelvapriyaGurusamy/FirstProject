package com.scan;

public class DescendingOrder {
	public static void main(String[] args) {
		int[] a = {10,60,80,5,50};
		int[] b = new int[a.length-1];
		int temp;
		for (int i = 0; i < a.length-1; i++) {

				b[i]=a[i]-a[i+1];
				System.out.println(b[i]);		
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = i+1; j < b.length; j++) {
				if(b[i]<b[j]) {
					temp=b[i];
					System.out.println(temp);
					b[i]=b[j];
					System.out.println(b[i]);
					b[j]=temp;
					System.out.println(b[j]);
			}
				
			}
			}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		
		}
	}
	
	
		
		
	}


