package Swetha;

import java.util.Scanner;

public class AllthenumarequalProgarm {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a value of A");
		int a = obj.nextInt();
		System.out.println("Enter a value of B");
		int b = obj.nextInt();
		System.out.println("Enter a value of C");
		int c = obj.nextInt();
		if (a == b && b == c && a == c) {
			System.out.println("all number are equal");
		} else {
			System.out.println("Numbers are not equal");
		}
	}

}
