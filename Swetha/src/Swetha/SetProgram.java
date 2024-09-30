package Swetha;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class SetProgram {

	public static void main(String[] args) {
		Set<Object> obj= new HashSet<Object>();
		obj.add(4);
		obj.add(3);
		obj.add(4.5);
		obj.add("Swetha");
		System.out.println(obj);
		System.out.println(obj.size());
	

	}

}
