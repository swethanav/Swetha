package Swetha;

public class MethodOverP1 {

	public static void main(String[] args) {
		Hone obj= new Gone();
		Hone obj1=new Hone();
		obj.add();
		obj1.add();

	}

}

class Hone {
	public void add() {
		int a = 100, b = 200, c = a + b;
		System.out.println(c);

	}

}

class Gone extends Hone
{

	public void add() {
		System.out.println("Add");
	}
}
