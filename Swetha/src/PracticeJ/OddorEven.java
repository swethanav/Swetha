package PracticeJ;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		int x;
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		System.out.println("Enter the number ");
		if(x%2==0)
			System.out.println("You have entered even number");
		else
			System.out.println("You have entered odd number");
				
		

	}

}
