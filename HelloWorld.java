package com.edubridge;

public class HelloWorld {
	//Instance variables
	int j;
	float k;
	String s;
	char ch;
	static int p; //class variable
	

	public static void main(String[] args) {
		int i=0; //local variables are not initialized, we need to initialize
		
		System.out.println(i);
		
		//create an object
		HelloWorld employee = new HelloWorld(); //instance variables will have default values

	     System.out.println("j="+employee.j); //0
	     System.out.println("k="+employee.k); //0.0
	     System.out.println("s="+employee.s); //null
	     System.out.println("ch="+employee.ch); //blank space
	     System.out.println("static access "+p);
	     System.out.println("static access "+employee.p);
	     System.out.println("static access "+HelloWorld.p);
	}

}