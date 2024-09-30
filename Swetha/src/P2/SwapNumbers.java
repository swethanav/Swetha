package P2;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String12[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int a= obj.nextInt();
		int b=obj.nextInt();
		System.out.println("Before Swapping: a="+a+",b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping: a="+a+",b="+b);
		

	}

}
