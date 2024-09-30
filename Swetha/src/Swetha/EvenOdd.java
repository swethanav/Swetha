package Swetha;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the num");
		int a = obj.nextInt();
		if (a % 2 == 0) {
			System.out.println(a+" is even number");
		} else {
			System.out.println(a+" is odd number");
		}

	}

}
