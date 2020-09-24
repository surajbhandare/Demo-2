//package IfElse;

import java.util.Scanner;
public class ifElsestatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt(); // get input from device
		
		if (number < 0) 
		{
			//check the number is less than 0 or not
			System.out.println("The Number " + number + " is negative");
			
		}
		
		else if (number ==0)
		{
			
			//when number not less than 0, check it is 
			System.out.println("The number is zero");
			
		}
		
		else 
		{
			//otherwise it is greater than 0
			System.out.println("The number" + number +"is posotive");
			
		}
		
		
	}

}
