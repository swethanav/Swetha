package PracticeJ;

import java.util.Scanner;

public class SwapNumber1 {

	public static void main(String[] args) {
		int x,y;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		x=obj.nextInt();
		y=obj.nextInt();
		System.out.println("Before Swapping\nx = "+x+"\ny= "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swapping the "+x+" "+y);
		

	}

}

