package com.firstproject;

public class Project1 {

public static void main(String[] args) {
	
	System.out.println("Hello World");
	
//	This is a single-line comment
	
	/*This is a multi-line comment
	 * Line Comment1
	 * Line Comment2
	 */
	
	String carName="Volvo";
	
	byte maxSpeed=120;
	
	int x=5;
	int y=10;
	int z=x+y;
	System.out.println(z);
	
	int a,b,c;
	
	int myNum = 9;
	float myFloatNum = 8.99f;
	char myLetter ='N';
	boolean myBool = false;
	String myText="Hello World";
	
	//primitive data types
	
	System.out.println("\n");
	int d=14,e=6,f=8;
	if((d>e)&&(d>f)) {
		
	System.out.println("Addition of d,e,f:" + (d+e+f));
	
	}
	System.out.println("\n");

	
	int h=4,n=6;
	if(h>n){
	System.out.println("h is greater");	
	
	}
	else {
	System.out.println("n is greater:"+n);	
	System.out.println(n);
	}
	System.out.println(n);
	

	String grade="B";
	switch(grade){
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Very good");
			break;
		case "C":
			System.out.println("Good");
			break;
		case "D":
			System.out.println("Better");
			break;
		case "E":
			System.out.println("Need improvement");
			break;
		
	}
	

}
}
