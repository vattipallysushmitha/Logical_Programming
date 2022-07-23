package com.bridzelab.FibonacciSeries;
import java.util.Scanner;   
public class FibonacciSeries {
public static void main(String[] args) {
	
	int a=0,b=1,c, i;  
	 System.out.print(a+" "+b);
	  
	 for(i=2;i<20;i++)
	 {  
	  c=a+b;  
	  System.out.print(" "+c);  
	  a=b;  
	  b=c;  
	 }  

	}}
