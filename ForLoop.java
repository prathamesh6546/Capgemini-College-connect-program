package com.edu.whileloop;

public class ForLoop {
public static void main(String[] args) {
	int sum=0;
	int sumodd=0;
	 for(int a=2;a<=100;a++) {
		 if(a%2==0) {
			 sum=sum+a;
		 }
		 else {
			 sumodd=sumodd+a;
		 }
}
	System.out.println("Sum of even no. is" + sum);
	System.out.println("Sum of odd no. is" + sumodd);

}}

