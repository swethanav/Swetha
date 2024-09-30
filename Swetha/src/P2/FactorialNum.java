package P2;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String12[] args) {
		int fact=1;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=obj.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial number is:"+fact);

}
}