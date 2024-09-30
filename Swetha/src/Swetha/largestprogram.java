package Swetha;

import java.util.Scanner;

public class largestprogram {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a value of A");
		int a = obj.nextInt();
		System.out.println("Enter a value of B");
		int b = obj.nextInt();
		System.out.println("Enter a value of C");
		int c = obj.nextInt();
		if (a >= b && a >= c) {
			System.out.println("a is greater");
		} else if (b >= c && b >= a) {
			System.out.println("b is greater");
		} else {
			System.out.println("c is greater");
		}
	}		

}
