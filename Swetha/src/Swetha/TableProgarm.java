package Swetha;

import java.util.Scanner;

public class TableProgarm {

	public static void main(String[] args) 
	{
		int i=1;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of number");
		int n=obj.nextInt();
		while(i<=10)
		{
			System.out.println(n+"*"+i+"="+i*n);
			i++;
		}

	}

}
