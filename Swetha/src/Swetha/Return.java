package Swetha;

public class Return {

	public static void main(String[] args) {
		
		new Return().returnMethod();

	}
	
	public void returnMethod() {
		boolean t=true;
		System.out.println("Before the return");
		if(t)
			return;
		System.out.println("This wont execute");
	}

}
