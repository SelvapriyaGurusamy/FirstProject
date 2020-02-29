package com.scan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerAscendingOrder {
public static int s() {
	List<Integer> li = new ArrayList<>();
	int a= 86935;
	int i,j=0;
	while(a>0) {
		i=a%10;
		li.add(i);
		a=a/10;
		}

	Collections.sort(li	);
	/*for(Integer x:li) {
		System.out.print(x);
		
		
	}*/
	int b=0;
	for (int j2 = 0; j2 <li.size(); j2++) {
		b=(b*10)+li.get(j2);
		
	}
	System.out.println(b);
	return j;
	
	
	
}
public static void main(String[] args) {
	s();
}
}