package Swetha;

import java.util.Scanner;

public class Numberdivby5and11 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = obj.nextInt();
		if (a % 5 == 0 && a % 11 == 0) {
			System.out.println("Number is divisible by 5 and 11");
		} else {
			System.out.println("Number is not divisible by 5 and 11");
		}

	}

}
