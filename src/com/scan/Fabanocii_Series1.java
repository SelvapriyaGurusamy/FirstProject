package com.scan;

public class Fabanocii_Series1 {
		public static void main (String[] args)
		{
			int a =0, b= 1, c = 0;
			for (int i = 1; i<=20; i++)
			{
				c = a+b;
				if (c<=10) {
					System.out.println(c);
					a = b;
					b = c;
				}
			}
		}

}
