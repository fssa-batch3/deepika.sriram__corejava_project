package com.fssa.creojava.day02.solved;

public class App {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("John");      
		String name = person.getName();  
		System.out.println(name);   
		
		
		Person2 person2 = new Person2();
		person2.setName("John");      
		String name2 = person.getName();  
		System.out.println(name2);
		
		
		CalculateArea area1 = new CalculateArea();
		System.out.println("Area of the circle is :"+area1.CalculateArea(21));
		System.out.println("Area of the rectangle is :"+area1.CalculateArea(21, 42));
		
		Calculator one = new Calculator();
		System.out.println(one.add(1, 2));
		System.out.println(one.add("Hello ", "World "));
		
		
	}
}
