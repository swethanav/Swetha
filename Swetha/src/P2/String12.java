package P2;

import java.util.Scanner;

public class String12 {

	public static void main(java.lang.String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=obj.nextLine();
		char ch;
		String nstr="";
		for(int i=0;i<input.length();i++)
		{
			ch=input.charAt(i);
			nstr=ch+nstr;
			
		}
		System.out.println("Revered string is "+nstr);
			
		

	}

}
