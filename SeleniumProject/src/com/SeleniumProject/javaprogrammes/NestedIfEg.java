package com.SeleniumProject.javaprogrammes;

public class NestedIfEg {

	public static void main(String[] args) {
		
		int a = 15;
		int b = 100;
		int c = 1000;
		
		if(a > b && a > c)
		{
			System.out.println("A is Greater");
		}
		else if(b > c && b > a)
		{
			System.out.println("B is Greater");
		}
		else if(c > a && c > b){
			System.out.println("C is Greater");
		}
		else
		{
			System.out.println("Make sure values are not duplicated");
		}
	}

}
