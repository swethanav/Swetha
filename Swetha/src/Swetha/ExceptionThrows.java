package Swetha;

import java.util.Scanner;

public class ExceptionThrows {

	public static void main(String[] args) {
		
		ExceptionThrows abc=new ExceptionThrows();
		try
		{
			abc.div();
		}
		catch(Exception obj)
		{
			System.out.println("Something is wrong");
		}

	}
public void div() throws Exception
{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter two number");
	int a=obj.nextInt();
	int b=obj.nextInt();
	int c=a/b;
	System.out.println("the result is "+c);
	
}
}
