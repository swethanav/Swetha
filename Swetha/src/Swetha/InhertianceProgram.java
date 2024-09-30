package Swetha;

public class InhertianceProgram {

	public static void main(String[] args) 
	{
		Three33 obj=new Three33();
		obj.add();
		obj.mult();
		obj.sub();
		

	}

}
    class one11
    {
    	int a=100;
    	int b=200;
    	public void add()
    	{
    		int c=a+b;
    		System.out.println(c);
    	}
    	
    }
    class Two22 extends one11
    {
    	public void mult()
    	{
    		int f=a*b;
    		System.out.println(f);
    	}
    }
    class Three33 extends Two22
    {
    	public void sub()
    	{
    		int d=b-a;
    		System.out.println(d);
    	}
    }
