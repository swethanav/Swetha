package PracticeJ;

import java.util.Scanner;

public class FactorialP1 {

	public static void main(String[] args) {
		int n,c,fact=1;
		System.out.println("Enter an integer to find the fact");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		if(n<0)
			System.out.println("Number should be non-negative");
		else
		{
			for(c=1;c<=n;c++)
				fact=fact*c;
			System.out.println("factorial of "+n+ "is ="+fact);
		}

	}

}
