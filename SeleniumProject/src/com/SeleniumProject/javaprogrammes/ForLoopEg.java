package com.SeleniumProject.javaprogrammes;

public class ForLoopEg {

	public static void main(String[] args) {
		//intialization; condition; incrementer/Decrementor
//		for(int i = 1; i <= 10; i++)
//		{
//			System.out.println("Hi");
//		}
		for(int i = 1; i <= 100; i++){
			System.out.println(i);
			if(i == 75){
				break;
			}
		}
		System.out.println("*********");
		
		for(int siri = 500; siri >= 1; siri--){
			System.out.println(siri);
//			if(siri == 1){
//				break;
//			}
		}

	}

}
