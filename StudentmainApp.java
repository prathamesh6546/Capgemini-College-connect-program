package com.edu.encapsulation;

import java.util.Scanner;
abstract class Student{
	static int age;
	static String name;
	//static variable,class variable
	abstract void inputStudentData(); {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name");
		name=scanner.nextLine();
		
		System.out.println("Enter Age");
		age = scanner.nextInt();
	}
}

public class StudentmainApp {

	public static void main(String[] args) {
		
		
		System.out.println("Name = "+ Student.name); 
		System.out.println("Age = "+ Student.age);
		 
	}

}