package com.bridzelab.PrimeNumber;
import java.util.Scanner;   

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  //make scanner obj
        System.out.println("Enter a number: ");
        int num = scanner.nextInt(); //Input int
        int flag=0;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag++;
	      }
	    }

	    if (flag==0)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	}