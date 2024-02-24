package com.SeleniumProject.javaprogrammes;

public class ConstructorEg {

	ConstructorEg() {
		System.out.println("This is ConstructorRg constructor code");
	}
	
	ConstructorEg(String course, int num) {
		System.out.println("This is ConstructorRg constructor code " + course + num);
	}
	
	public static void main(String[] args) {
		
		ConstructorEg ce = new ConstructorEg("Selenium", 50000);
		ConstructorEg ce1 = new ConstructorEg();
		eg1();
	}

	public static void eg1(){
		System.out.println("This is eg1 code");
	}
}
