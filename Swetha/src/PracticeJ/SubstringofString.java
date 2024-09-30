package PracticeJ;

import java.util.Scanner;

public class SubstringofString {

	public static void main(String[] args) {
		String string,sub;
		int i,c,length;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string to print all the substrings");
		string=in.nextLine();
		
		length=string.length();
		System.out.println("Substring of"+string );
		for(c=0;c<length;c++)
		{
			for(i=1;i<=length-c;i++)
			{
				sub=string.substring(c,c+i);
				System.out.println(sub);
			}
		}
				
				

	}

}
