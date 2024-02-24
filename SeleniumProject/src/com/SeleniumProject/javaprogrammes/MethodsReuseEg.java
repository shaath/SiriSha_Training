package com.SeleniumProject.javaprogrammes;

public class MethodsReuseEg {

	public static void main(String[] args) {
		
		MethodsEg.Function1();

		MethodsEg me = new MethodsEg();
		me.Function3();
		
		int res = me.sum(30, 70, 50);
		System.out.println(res);
		
		
	}

}
