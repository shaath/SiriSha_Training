package com.SeleniumProject.javaprogrammes;

public class StringReverseEg {

	public static void main(String[] args) {
		
		String course = "Malayalam";  //muineleS    malayalam   malayalam
		String rev = "";
		
		int len = course.length();
		for(int i = len-1; i >= 0; i--)
		{
//			System.out.print(course.charAt(i));
			rev = rev + course.charAt(i);
		}
		System.out.println(rev);

		if(course.equalsIgnoreCase(rev))
		{
			System.out.println("The Given String is polindrome");
		}
		else
		{
			System.out.println("The Given String is not  Polindrome");
		}
	}

}
