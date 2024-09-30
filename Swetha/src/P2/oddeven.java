package P2;

import java.util.Scanner;

public class oddeven {

	public static void main(String12[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter any number");
		int number=obj.nextInt();
		if(number%2==0)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");

	}

}
