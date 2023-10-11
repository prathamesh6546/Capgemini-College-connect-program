package com.edu.whileloop;

import java.util.Scanner;

public class ArmStrongNum {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number:");
			double sum=0;
			int a=0;
			int num=sc.nextInt();
			int temp=num;
		    String len=String.valueOf(num);
		    int pow=len.length();
		  while(num>0)
		  {
			a=num%10;
			sum=sum+Math.pow(a, pow);
			num=num/10;
		  }
	  if(temp==sum)
	  {
		  System.out.println("Number is amstrong number");
	  }
	  else
	  {
		  System.out.println("Number is not Amstrong number");
	  }
	  sc.close();
		}

	}

