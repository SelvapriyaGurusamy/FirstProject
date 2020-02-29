package com.scan;

public class Numberfor {
	public static void number() {
		String s = "1df2ad3abcdef";
		String str = s.replaceAll("[^0-9]", "");
		System.out.println(str);
		
		//int parse= Integer.parseInt(str);
		//System.out.println(parse);

	}
	public static void main(String[] args) {
		number();
	}

}
