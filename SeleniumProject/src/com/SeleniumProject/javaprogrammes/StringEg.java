package com.SeleniumProject.javaprogrammes;

public class StringEg {

	public static void main(String[] args) {
		
		String course = "Selenium";
		
//		System.out.println(course.length());
//		System.out.println(course.toUpperCase());
//		System.out.println(course.toLowerCase());
		
//		System.out.println(course.charAt(4));
//		System.out.println(course.indexOf('e'));
//		System.out.println(course.lastIndexOf('e'));
		
//		System.out.println(course.substring(2, 8));
//		System.out.println(course.substring(2));
		
//		String x = course.trim();
//		System.out.println(course.trim().length());
//		System.out.println(course.replace('e', 'X'));
//		System.out.println(course.replace("len", "XYZ"));
//		System.out.println(course.replaceFirst("e", "Z"));
		
//		System.out.println(course.equals("Selenium"));
//		System.out.println(course.equalsIgnoreCase("selenium"));
		
//		System.out.println(course.contains("len"));
		
//		System.out.println(course.startsWith("Sel"));
//		System.out.println(course.endsWith("m"));
		
//		System.out.println(course + " is a course" + "XYZ");
//		System.out.println(course.concat(" Sirisha"));
		System.out.println(course.join(" ", course, "Sirisha", "Manual", "XYZ"));
	}

}
