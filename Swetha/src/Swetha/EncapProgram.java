package Swetha;

public class EncapProgram {

	public static void main(String[] args) {
		Harshit11 obj=new Harshit11();
		obj.setAge(23);
		obj.setName("Swetha");
		obj.setMarks(90);
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println(obj.getMarks());
		

	}

}
class Harshit11
{
	private int age;
	private String name;
	private int marks;

public void setAge(int yourAge)
{
	age=yourAge;
}
public void setName(String yourName)
{
	name=yourName;
}
public void setMarks(int yourMarks)
{
	marks=yourMarks;
}
public int getAge()
{
	return age;
}
public String getName()
{
	return name;
	
}
public int getMarks()
{
	return marks;
}
}