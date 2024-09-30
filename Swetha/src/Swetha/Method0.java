package Swetha;

public class Method0 {
	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public void add(String f,String h) {
		String g=f+" "+h;
		System.out.println(g);
	}

	public static void main(String[] args) {

		Method0 obj = new Method0();
		obj.add(20, 50);
		obj.add("S","A");

	}

}
