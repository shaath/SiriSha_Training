package com.SeleniumProject.javaprogrammes;

public class ObjectEg {

	public static void main(String[] args) {
		
		Object[] x = {"Selenium", 50000, 'M', true, 535.3532};
		
		System.out.println(x.length);
		
		for(Object data: x)
		{
			System.out.println(data);
		}

	}

}
