package Swetha;

import java.util.Scanner;

public class FactorialProgarm {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the numbers:");
		int num=obj.nextInt();
		long fact=1;
		for (int i=1;i<=num;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial of num "+ fact);

	}

}
