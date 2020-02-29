package com.scan;

public abstract class Employee {

private String name;
private String address;
private int numebr;
public  Employee (String name, String address, int number) {
	System.out.println("constructing");

	this.name=name;
	this.address=address;
	this.numebr=number;

	}
public double computepay() {
	System.out.println("inside");
	return 0.0;
	
}
public void mailcheck() {
	System.out.println("mailing" + this.name+ "" + this.address);
}
} 

//Parent class coding
/*public class AbstractDemo {
public static void main(String[] args) {
	Employee sam = new Employee("makb nagar", "chennai", 167);
	sam.mailcheck();*/

//Array program
/*package com.scan;

public class AbstractDemo{
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,7};
		for (int i = 0; i < a.length; i++) {
			if(a[i]>=5){
				System.out.println("exit...");
				System.exit(0);
				
			}
			else {
				System.out.println("a["+i+"]="  +a[i]);
			}
			System.out.println("end of program");
		}
	}
	
		
		
	}
*/
// Question with final keyword

/*package com.scan;

public class AbstractDemo{
	static final int CAPACITY = 4;
	public static void main(String[] args) {
		CAPACITY=5;
		System.out.println(CAPACITY);*/