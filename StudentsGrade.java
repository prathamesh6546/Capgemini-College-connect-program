package com.edu.Grade;

import java.util.Scanner;

public class StudentsGrade {
	int a;
	public void Inputmarks() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of Student");
		a=sc.nextInt();
	}
	void DisplayGrade() {
	
	 if(a<=100 && a>=80) {
			System.out.println("Grade A");
		}
		else if(a<=79 && a>=60) {
			System.out.println("Grade B");
		}
		else if(a<=59 && a>=40) {
			System.out.println("Grade C");
		}
		else if(a<=39 && a>=35) {
			System.out.println("Grade D");
		}
		else if(a<=34 && a>=0){
			System.out.println("Fail");
		}
		else{
			System.out.println("Invalid Marks");}
	 
	}
	
	public static void main(String[] args) {
		StudentsGrade sg=new StudentsGrade();
		sg.Inputmarks();
		sg.DisplayGrade();
	}
}
 