package com.edu.Grade;

import java.util.Scanner;

public class Grade {
	char grade;
	public void Inputmarks() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of Student");
		grade=sc.next().toUpperCase().charAt(0);
	}
	void DisplayGrade() {
	
	 if(grade=='A') {
			System.out.println("Marks are in range 80 to 100");
		}
		else if(grade=='B') {
			System.out.println("Marks are in range 60 to 79");
		}
		else if(grade=='C') {
			System.out.println("Marks are in range 40 to 59");
		}
		else if(grade=='D') {
			System.out.println("Marks are in range 35 to 39");
		}
		else if(grade=='F'){
			System.out.println("Marks are in range 0 to 34");
		}
		else{
			System.out.println("Invalid Input");}
	 
	}
	
	public static void main(String[] args) {
		Grade sg=new Grade();
		sg.Inputmarks();
		sg.DisplayGrade();
	}
}
 