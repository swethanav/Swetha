package Swetha;

import java.util.Scanner;
public class Nestedif {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a num of A");
		int a=obj.nextInt();
		System.out.println("Enter a num of B");
		int b=obj.nextInt();
		System.out.println("Enter a num of C");
		int c=obj.nextInt();
		if(a>b)
		{
			if (a>c)
			{
				System.out.println("a is greater");
			}
			else
			{
				System.out.println("c is greater");
			}
		}
		else if(b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
				}
		

}
