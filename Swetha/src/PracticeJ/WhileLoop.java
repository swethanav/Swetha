package PracticeJ;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Input the integer");
		
		while((n=in.nextInt())!=0)
		{
			System.out.println("You entered"+n);
			System.out.println("Input an integer");
			
		}
		System.out.println("Out of loop");

	}

}
