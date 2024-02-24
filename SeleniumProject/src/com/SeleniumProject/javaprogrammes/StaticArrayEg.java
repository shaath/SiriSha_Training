package com.SeleniumProject.javaprogrammes;

public class StaticArrayEg {

	public static void main(String[] args) {
		
		int[] intSalary = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000};

		System.out.println(intSalary.length);
		
//		System.out.println(intSalary[3]);
		for(int i = 0; i < intSalary.length; i++){
			System.out.println(intSalary[i]);
		}
	}

}
