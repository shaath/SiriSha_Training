package com.SeleniumProject.javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args) {
		
		Object[] x = new Object[5];
		
		System.out.println(x.length);
		
		x[1] = "Selenium";
		x[3] = 80000;
		x[1] = "Apple";
		
		
//		System.out.println(x[1]);
		
		for(Object data: x)
		{
			System.out.println(data);
		}
		
	}

}
