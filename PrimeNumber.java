package com.edu.nmbers;

import java.util.Scanner;
public class PrimeNumber{
   public static void main(String arg[]){
      int i,n,a, j;
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter the n value : ");
      n=sc.nextInt();
      System.out.print("Prime numbers between 1 to "
      		+n + " are");
      for(j=2;j<=n;j++){
         a=0;
         for(i=1;i<=j;i++){
            if(j % i==0){
               a++;
            }
         }
         if(a==2)
         System.out.print(j+" ");
      }
   }
}
