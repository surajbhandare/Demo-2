//package inputoutput;
import java.util.Scanner; // Import package to use scanner for reading data
public class inputoutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is My First Line ");
		
		int x = 10;
		// with the string, + is used to display value of the variable
		System.out.println("Value of X:" + x);
		
		
		System.out.print("First Method"); // printf() use  all the line print in single line
		System.out.print("Second Method"); // printf() use  all the line print in single line
		
		 
		System.out.printf("this is value of x = %d , PI = %f\n", x, 39f/7); // Formatted output string using format specifier
		
		Scanner scanner =  new Scanner (System.in); //scanner class object to read from input devices
		System.out.println("Enter Data using Keyboard");
		int data = scanner.nextInt(); // it will take integer as input value and store to data
		System.out.println("The data has bee read : " + data);
		scanner.close(); // close the scanner object when inputs new obtained
		
		
		
	}

}
