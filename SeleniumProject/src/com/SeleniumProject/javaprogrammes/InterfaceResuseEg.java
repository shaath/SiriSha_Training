package com.SeleniumProject.javaprogrammes;

public class InterfaceResuseEg {

	public static void main(String[] args) {
		
		InterfaceEg ie1 = new InterfaceEgImplementsEg1();
		
		ie1.Ship();

		InterfaceEg ie2 = new InterfaceEgimplementsEg2();
		ie2.Ship();
	}

}
