
package com.bridzelab.ReverseNumber;
import java.util.Scanner;   // Import Scanner
public class ReverseNumber {

	public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);  // Make Scanner obj
		        System.out.println("Enter a number: ");
		        String number = scanner.next();
		        int newNum = Integer.parseInt(number); // this method is  used to convert String to Integer in Java
		        int reverseNum=0;

		        for(int i=1;i<=number.length();i++){
		            int remainder = newNum%10;  //To find remainder
		            newNum = newNum/10;
		            reverseNum = reverseNum*10+remainder;  //Reverse Number logic
		        }
		        System.out.println("Reverse number is: "+ reverseNum);
		        }

		}