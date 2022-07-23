
package com.bridzelab.ReverseNumber;
import java.util.Scanner;   // Import Scanner
public class ReverseNumber
{

	public static void main(String[] args) 
	{
		
		int x, reverse=0;
		System.out.print("Enter the number that you want to reverse: ");  
		Scanner sc = new Scanner(System.in);  
		int num = sc.nextInt();  
	     while(num!=0)
	     {
	    	 int remainder = num % 10;  
	    	 reverse = reverse * 10 + remainder;  
	    	 num = num/10;  
	    	 }  
	    	 System.out.println("The reverse of the given number is: " + reverse);  
	     }
	}
	
