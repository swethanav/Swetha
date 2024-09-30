package Swetha;

import java.util.Scanner;

public class EXdemoP1 {

	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter your age please:-");
		try
		{
			int age=obj.nextInt();
			System.out.println("Your age please");
		}
		catch(Exception e)
		{
			System.out.println("Please enter the digit only");
		}

	}

}
