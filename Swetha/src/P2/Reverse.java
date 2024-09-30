package P2;

import java.util.Scanner;

public class Reverse {

	public static void main(String12[] args) {
		int no,rev=0,r,a;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number");
		no=obj.nextInt();
		a=no;
		while(no>0)
		{
			r=no%10;
			rev=rev*10+r;
			no=no/10;
			
		}
		System.out.println("Reverse:"+rev);

	}

}
