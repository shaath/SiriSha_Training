package com.SeleniumProject.javaprogrammes;

import java.util.HashSet;
import java.util.Set;

public class HashSetEg {

	public static void main(String[] args) {
		
		Set<Object> hs = new HashSet<>();
		
		hs.add("Selenium");
		hs.add(854768);
		hs.add("Boll");
		hs.add(true);
		hs.add('M');
		hs.add("Selenium");
		
//		hs.remove("Boll");
//		System.out.println(hs.size());
		
		for(Object d: hs){
			System.out.println(d);
		}
	}
}
