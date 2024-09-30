package PracticeJ;

import java.util.Scanner;

public class Ifelse2 {

	public static void main(String[] args) {
		int marksObtained,passingmarks;
		
		passingmarks=40;
		Scanner in=new Scanner(System.in);
		System.out.println("Input marks scored by you");
		marksObtained = in.nextInt();
		if (marksObtained>= passingmarks)
		{
			System.out.println("you have passed the exam");
		}
		else
		{
			System.out.println("You have not passed the exam");
		}

	}

}
