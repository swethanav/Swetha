package PracticeJ;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		int marks,passingmarks;
		char grade;
		
		passingmarks=40;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the marks obatined");
		marks=in.nextInt();
		if (marks>=passingmarks)
		{
			if(marks>90)
				grade='A';
			else if(marks >75)
				grade='B';
			else if(marks>60)
				grade='C';
			else
				grade='D';
			
			System.out.println("You hav passed the exam and your grade is "+grade);
		}
		else {
			grade='F';
			System.out.println("YOu failes the exam"+grade);
		}
		

	}

}
