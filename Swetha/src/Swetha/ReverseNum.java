package Swetha;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the numbers:");
		int num=obj.nextInt();
		int rev=0;
		
		while(num!=0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println("Reverese number "+ rev);
		

	}

}
