package Swetha;

import java.util.Scanner;

public class ArrayAsceP {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=obj.nextInt();
		int a[]=new int[size];
		for (int i=0;i<size;i++)
		{
			System.out.println("Please enter the value of index number"+i+"-");
			a[i]=obj.nextInt();
		}
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println();
		System.out.println("Elements of array sorted in ascending order");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}

	}

}
