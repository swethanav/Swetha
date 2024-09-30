package Swetha;

import java.util.Scanner;

public class ArrayThree {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of array;-");
		int size=obj.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Please eneter the value of index"+i+"-");
			a[i]=obj.nextInt();
		}
		for(int j=0;j<size;j++)
		{
			System.out.println("Value of index number"+j+"-"+a[j]);
			
		}

	}

}
