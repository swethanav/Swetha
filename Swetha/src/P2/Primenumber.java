package P2;

import java.util.Scanner;

public class Primenumber {

	public static void main(String12[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=obj.nextInt();
		
		if(isPrime(number))
		{
			System.out.println(number+" is a prime number");
		}
		else
		{
			System.out.println(number+" is not prime number");
		}

	}

	private static boolean isPrime(int number) {
		for(int i=2;i<=number/2;i++)
			if(number%i==0) {
		return false;
	}
		return true;

}
}
