package com.SeleniumProject.javaprogrammes;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEg {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		
		al.add("Selenium");
		al.add('M');
		al.add(8976347);
		al.add(true);
		al.add(3453.55);
		al.add("Selenium");
		al.add(2, "Apple");
		
//		al.remove(2);
//		al.remove("Selenium");
//		al.clear();
		al.set(2, "Boll");
		List<Object> sL = al.subList(2, 5);
		System.out.println(sL);
		
		System.out.println(al.size());
		
//		System.out.println(al.get(2));
		for(Object d: al){
			System.out.println(d);
		}

	}

}
