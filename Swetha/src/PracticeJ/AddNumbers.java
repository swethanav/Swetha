package PracticeJ;

import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		int x,y,z;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the digits to find the sum");
		x =in.nextInt();
		y =in.nextInt();
		z=x+y;
		System.out.println("The sum of number is = " + z);

	}

}
