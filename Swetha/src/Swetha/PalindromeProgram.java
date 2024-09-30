package Swetha;

import java.util.Scanner;

public class PalindromeProgram {

	public static void main(String[] args) {
		String original, reverse = "";
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the string or number ");
		original = obj.nextLine();
		int length = original.length();

		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equals(reverse))
			System.out.println(original +" string/number is palindrome");
		else
			System.out.println(original +" string/number is not palindrome");

	}

}
