package P2;

public class Sumofnum {

	public static void main(String12[] args) {
		int number=12345;
		int sumofdigits=calculateSumofDigits(number);
		System.out.println("Sum of digits of"+number+"is:"+sumofdigits);
		

	}

	private static int calculateSumofDigits(int number) {
		int sum=0;
		while(number>0)
		{
			int digit=number%10;
			sum=sum+digit;
			number=number/10;
			
		}
		return sum;
	}

}
