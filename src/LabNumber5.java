
//Jiao Xu  4/26/2018
//This program calculate the factorial of a number.
import java.util.Scanner;

public class LabNumber5 {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		int num = 0;
		String ifContinue = "y";

		do {
			// verify the number is between 1 and the highest integer that returns
			// accurate factorial calculation 
			System.out.println("Please enter an integer from 1 to 20!");//20 factorial hit the limit of long.
			num = scnr.nextInt();
			if (num < 1 || num > 20) {
				System.out.println("The number entered does not meet requirement!");
				continue;
			}

			// call factorial method which include the for loop to calculate it
			// display the factorial of the number
			System.out.println("Factorial of " + num + " is: " + factorial(num));

			// prompt user to enter if they want to continue
			System.out.print("Continue? (y/n): ");
			ifContinue = scnr.next();
		} while (ifContinue.equalsIgnoreCase("y"));// determine the input

		System.out.println("Bye!");// if the input is no, end the program
		scnr.close();

	}

	public static long factorial(int num) {
		// declare factorial and initiate it.
		long fact = 1;
		for (int i = 1; i <= num; i++) {
			// calculate the factorial of num
			fact = fact * i;
		}
		return fact;
	}
}
