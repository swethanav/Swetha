package PracticeJ;

import java.util.Scanner;

public class FahrenhitToCelsius {

	public static void main(String[] args) {
		float temp;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the temp in Farenheit");
		temp=in.nextInt();
		temp=((temp-32)*5)/9;
		System.out.println("Temp in Celsisus is = " + temp);
	}

}
