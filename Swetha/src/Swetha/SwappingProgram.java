package Swetha;

import java.util.Scanner;

public class SwappingProgram {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		int x = obj.nextInt();
		int y = obj.nextInt();

		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swapping " + x + " " + y);

	}

}
