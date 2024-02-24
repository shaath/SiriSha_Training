package com.SeleniumProject.javaprogrammes;

public class TwoDimArrayEg {

	public static void main(String[] args) {
		Object[][] y = new Object[2][3];
		
		System.out.println("Rows length: " + y.length);
		System.out.println("Columns length: " + y[0].length);
		
		y[0][1] = "Sirisha";
		y[1][2] = "Apple";
		
//		System.out.println(y[0][1]);
		
		for(int i = 0; i < y.length; i++)
		{
			for(int j = 0; j < y[i].length; j++)
			{
				System.out.println(y[i][j]);
			}
		}

	}

}
