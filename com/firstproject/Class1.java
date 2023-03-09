package com.firstproject;

public class Class1 {
	public static void main(String[] args) {
		int b=15;
		int data=5;
		System.out.println(data+b);
		System.out.println("Hello World");
		System.out.print("Line2");
		System.out.print("Line3");
		System.out.println("Line2");
		System.out.println("Line3");
		System.out.println("First Java...");
		System.out.println("\n");
		
		
		int i=1;
		while(i<=10) {
			if(i==5) {
				i++;
				continue;
				
			}
			System.out.println(i);
			i++;
			
		}
	
		int j=4;
		do {
			if(j==8) {
				j++;
				continue;
				
			}
			
			System.out.println(j);
			j++;
		}while(j<=10);
		
	}
}
