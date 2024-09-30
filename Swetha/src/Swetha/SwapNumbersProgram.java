package Swetha;

import java.util.Scanner;

public class SwapNumbersProgram {

	public static void main(String[] args) {
		int a, b, c;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value of a");
		a = obj.nextInt();
		System.out.println("Enter the value of b");
		b = obj.nextInt();
		c = a;
		a = b;
		b = c;
		System.out.println("vlaues of a:" + a);
		System.out.println("values of b:" + b);

	}

}
