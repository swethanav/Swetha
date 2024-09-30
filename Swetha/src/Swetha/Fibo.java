package Swetha;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		
		int num1=0,num2=1,num3;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the Range:");
		int range=obj.nextInt();
		System.out.print(num1 + " " + num2);
		for(int i=1;i<range;i++)
		{
			num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
		}
		}

}
