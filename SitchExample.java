package com.edu.Grade;

import java.util.Scanner;

class Calculator{
	double a,b,c;
	
	void InputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two numbers");
		a=sc.nextDouble();
		b=sc.nextDouble();
	}
	void Addition() {
		c=a+b;
		System.out.println("Addition is " + c);
	}
	void Substraction() {
		c=a-b;
		System.out.println("Substraction is " + c);
	}
	public void Multiplication() {
		c=a*b;
		System.out.println("Multiplication is " + c);
		
	}
	public void Division() {
		c=a/b;
		System.out.println("Division is " + c);
		
	}
}

public class SitchExample {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.InputData();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		
		switch(ch){
		case 1:c.Addition();
		break;
		case 2:c.Substraction();
		break;
		case 3:c.Multiplication();
		break;
		case 4:c.Division();
		break;
		
		default:
			System.out.println("Invalid Choice");
		}
	}
}
