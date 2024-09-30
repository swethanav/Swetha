package Swetha;

import java.util.Scanner;

public class ArmstrongProgram {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the input number");
		int number = obj.nextInt(); 
		int originalNumber, remainder, result = 0;
		originalNumber = number;
		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			result = (int) (result + Math.pow(remainder, 3));
			originalNumber /= 10;
		}

		if (result == number)
			System.out.println(number + " is an Armstrong number");
		else
			System.out.println(number + " is not Armstsrong number");

	}

}
