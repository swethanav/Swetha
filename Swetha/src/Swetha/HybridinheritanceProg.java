package Swetha;

public class HybridinheritanceProg {

	public static void main(String[] args) {
		C33 obj = new C33();
		B22 obj1 = new B22();
		D obj2 = new D();
		obj.add();
		obj1.mult();
		obj.sub();
		obj2.div();
		

	}

}
class A11 {
	int a = 100;
	int b = 200;

	public void add() {
		int c = a + b;
		System.out.println(c);
	}

}

class B22 extends A11 {
	public void mult() {
		int f = a * b;
		System.out.println(f);
	}
}

class C33 extends A11 {
	public void sub() {
		int d = b - a;
		System.out.println(d);
	}

}
class D extends A11 {

	public void div() {
		int h = a / b;
		System.out.println(h);
	}
}
