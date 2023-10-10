package com.edu.oper;

public class Largest3 {
	
		public static void main(String[] args) {
			int a=10,b=10,c=10;
			if(a==b & a==c)
			{
				System.out.println("All are same numbers");
				return;
			}
			if(a>b && a>c)
			{
				System.out.println("a:"+a+" is greater among three numbers");
			}
			else
			{
				if(b>c & b>a)
				{
					System.out.println("b:"+b+" is greater among three numbers");
				}
				else
				{
					System.out.println("c:"+c+" is greater among three numbers");
				}
			}
		}

	}