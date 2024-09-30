package P2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String12[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=obj.nextInt();
		
		if(isPalindrome(number))
		{
			System.out.println(number+"is a palindrome");
		}
		else
		{
			System.out.println(number+"is not a palindrome");
		}

	}

	private static boolean isPalindrome(int number) {
		int originalNumber=number;
		int reverseNumber=0;
		
		while(number!=0)
		{
			int digit=number%10;
			reverseNumber=reverseNumber*10+digit;
			number=number/10;
		}
		return originalNumber==reverseNumber;
	}

}
