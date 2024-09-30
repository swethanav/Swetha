package Swetha;

import java.util.Scanner;

public class NestedIFDemo {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number ");
		int i=obj.nextInt();
		if(i==10 || i<15)
		{
			if(i<15)
				System.out.println("i is smaller than 15");
			if(i<12)
				System.out.println("i is smaaler than 12");
		}
			else
			{
				System.out.println("i is greater than 15");
				
		}

	}

}
