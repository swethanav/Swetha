package Swetha;

import java.util.Scanner;

public class VowelsConsonantsProgram {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Input a character");
		char c = obj.next().charAt(0);
		switch (c) {
		case 'a':
			System.out.println(c +" is vowel");
			break;
		case 'e':
			System.out.println(c +" is vowel");
			break;
		case 'i':
			System.out.println(c +" is vowel");
			break;
		case 'o':
			System.out.println(c+" is vowel");
			break;
		case 'u':
			System.out.println(c+" is vowel");
			break;

		default:
			System.out.println(c + " is a consonant");
		}

	}

}
