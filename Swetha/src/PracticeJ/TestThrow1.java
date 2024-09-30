package PracticeJ;

public class TestThrow1 {

	public static void main(String[] args) {
		validate(13);
		System.out.println("rest of code.....");

	}

	private static void validate(int i) {
		if (i<18)
		throw new ArithmeticException("not valid");
		else
			System.out.println("Welcome to the institute");
			
		
	}

}
