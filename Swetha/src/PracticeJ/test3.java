package PracticeJ;

public class test3 {

	public static void main(String[] args) {
		SBI s=new SBI();
		ICICI i=new ICICI();
		AXIS a=new AXIS();
		
		System.out.println("SBI Rate of interest"+s.getRateofInterest());
		System.out.println("ICICI rate of interest"+s.getRateofInterest());
		System.out.println("AXIS rate of interest"+s.getRateofInterest());

	}

}
class Bank{
	int getRateofInterest() {return 0;}
}
class SBI extends Bank{
	int getRateofInterest() {return 8;}
}
class ICICI extends Bank{
	int getRateofInterest() {return 7;}
}
class AXIS extends Bank{
	int getRateofInterest() {return 9;}
}
