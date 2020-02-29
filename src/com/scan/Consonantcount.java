package com.scan;

public class Consonantcount {
	public static void main(String[] args) {
		
		
		String name = "Welcome";
		int vowelscount=0;
		int consonantcount=0;
		for(int i =0; i<name.length(); i++) {
			char ch = name.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'||ch=='O'||ch=='U' ) {
				vowelscount++;
			}else {
				consonantcount++;
				
			}
		}
		
		System.out.println(vowelscount);
		System.out.println(consonantcount);

	}

}
