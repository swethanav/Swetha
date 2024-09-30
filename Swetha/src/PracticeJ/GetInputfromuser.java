package PracticeJ;

import java.util.Scanner;

public class GetInputfromuser {

	public static void main(String[] args) {
		int a;
		float b;
		String s;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		s=in.nextLine();
		System.out.println("The entered string is" + s);
		
		System.out.println("Enter an integer");
		a=in.nextInt();
		System.out.println("The entered integer is" + a);
		
		System.out.println("Enter an Float");
		b=in.nextFloat();
		System.out.println("The entered float is" + b);
		

	}

}
