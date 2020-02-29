package com.scan;

public class ReverseStringWord {
	public static void main(String[] args) {
		String s = "Welcome to java class";
		String reverse = "";
		String[] splitted = s.split(" ");
		for(int i=splitted.length-1; i>=0;i--) {
			String old = splitted[i];
			reverse= reverse+old+" ";
			
			
		}
		System.err.println(reverse.trim());
		
	}

}
