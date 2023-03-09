package com.firstproject;

public class Assignment2 {

	public static void main(String[] args) {
		
	   System.out.println("Array in reverse order");
       int arr[]= {1,2,3,4,5};
	
		for(int i=arr.length-1;i>=0;i--) {
			
			System.out.println(arr[i]);
		}
		
		
		System.out.println("Print all the values using nested for each");
		int array1[][]= {{10,20,30,40,50},{60,70,80,90}};
		
		for(int []array:array1) {
			
			for(int value:array)
				
			System.out.println(value);
		}	
	}
}
