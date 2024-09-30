package PracticeJ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistTech {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Rajendra");
		list.add("Mahendra");
		list.add("Raja");
		list.add("techer");
		
	Iterator itr=list.iterator();
	while(itr.hasNext());
	{
		System.out.println(itr.next());
	}
	
//	while(itr.hasNext());
//	{
//		System.out.println(itr.next());
//	}
	

}
	

}
