package com.edu.oper;

import java.util.Scanner;

public class Largest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two number");
			int a,b;
	a=sc.nextInt();
	b=sc.nextInt();
	if(a==b)
		System.out.println("both are equal");
	else if(a>b)
		System.out.println(a + " is greater");
	else
		System.out.println(b + " is greater");
	
}
}
