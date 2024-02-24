package com.SeleniumProject.javaprogrammes;

import java.util.HashMap;
import java.util.Map;

public class HashMapEg {

	public static void main(String[] args) {
		
		Map<Integer, String> m = new HashMap<>();
		
		m.put(4, "April");
		m.put(3454, "Apple");
		m.put(6, "June");
		m.put(4, "Sirisha");
		m.put(6, "Boll");
		
		System.out.println(m.keySet());

//		System.out.println(m+"---"+m.size());
		
//		System.out.println(m.get(4));
		
		for(Map.Entry<Integer, String> d: m.entrySet()){
			
			System.out.println(d.getKey()+"----"+d.getValue());
		}

	}

}
