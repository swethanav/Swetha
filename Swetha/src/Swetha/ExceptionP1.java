package Swetha;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionP1 {

	public static void main(String[] args) {
		try {
			Scanner obj = new Scanner(System.in);
			System.out.println("Please enter two number");
			int num1 = obj.nextInt();
			int num2 = obj.nextInt();
			int div = num1 / num2;
			System.out.println("Result " + div);
		} 
		catch (InputMismatchException obj1)
		{
			System.out.println("Enter only digit nothing else");
		} 
		catch (ArithmeticException obj2)
		{
			System.out.println("Number is not divisible by zero so please enter a valid number ");
		}

	}

}
