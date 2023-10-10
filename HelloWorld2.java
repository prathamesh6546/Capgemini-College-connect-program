package com.edubridge;

public class HelloWorld2 {
	
	float k; //instance variable with out static keyword
	String s; //instance variable with out static keyword
	static int j; //static variable are class variables
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;  // local variable not initialized, we need to initilize
		System.out.println(i);
		System.out.println(j); //main access static data
		
		HelloWorld helloworld = new HelloWorld();
		System.out.println(helloworld.k); //instance variable cannot access
          System.out.println(helloworld.s);
		
	}

}