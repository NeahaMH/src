package com.firstproject;

public class Exception {

	public static void main(String[] args) {
		
		String name = null;
		
		try {
			System.out.println(name.length());
		} catch (java.lang.Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println(e);
		}
		System.out.println("Rest of the code");
		
	}
}
