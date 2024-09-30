package P2;

import java.util.Scanner;

public class Fibonaccinum {

	public static void main(String12[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int number=8;
		int first=0,second=1,next;
		System.out.println("Fibonacci series is");
		for(int i=0;i<=number;i++)
		{
			System.out.println(first+"");
			next=second+first;
			first=second;
			second=next;
			
		}

	}

}
