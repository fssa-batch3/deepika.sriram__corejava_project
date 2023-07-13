package com.fssa.corejava.day02.misc;

public class App {

	public static void main(String[] args) {
		Academy academy = new Academy();
		academy.setId(012);
		academy.setName("Freshworks STS Software Academy");
		academy.setCode("FSSA");
		
		Student std1 = new Student();
		std1.setName("Deepika");
		std1.setId(0126);
		std1.setEmail("deepika@fssa.freshworks.com");
		
		System.out.println(Student.count);
		
		Student std2 = new Student();
		std2.setName("Uthra");
		std2.setId(0135);
		std2.setEmail("uthra@fssa.freshworks.com");
		
		System.out.println(Student.count);
	}

}
