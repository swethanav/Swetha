package Swetha;

public class HierInheritancePro {

	public static void main(String[] args) 
	{
		C3 obj=new C3();
		B2 obj1=new B2();
		obj.add();
		obj1.mult();
		obj.sub();
		

	}

}
    class A1
    {
    	int a=100;
    	int b=200;
    	public void add()
    	{
    		int c=a+b;
    		System.out.println(c);
    	}
    	
    }
    class B2 extends A1
    {
    	public void mult()
    	{
    		int f=a*b;
    		System.out.println(f);
    	}
    }
    class C3 extends A1
    {
    	public void sub()
    	{
    		int d=b-a;
    		System.out.println(d);
    	}
    

	}

