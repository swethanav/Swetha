package P2;

import java.util.Scanner;

public class Numberofdigits {

	public static void main(String12[] args) {
		int num=0,a=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter any number :");
		num=obj.nextInt();
		if(num<0)
		{
			num=num*-1;
			
		}else if(num==0)
		{
			num=1;
		}
		while(num>0)
		{
			num=num/10;
			a++;
			System.out.println("Number of digits given in number:"+a);
		}

	}

}
