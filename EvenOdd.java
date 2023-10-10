package com.edu.Grade;

import java.util.Scanner;

public class EvenOdd 
	{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int num;
			System.out.printf("Enter the Number : ");
			num=sc.nextInt();
			switch(num%2)
			{
				case 0:System.out.printf(num+" is a Even Number");
					   break;
	 
				case 1:System.out.printf(num+" is a Odd Number");
					   break;
			}
		}
	}

