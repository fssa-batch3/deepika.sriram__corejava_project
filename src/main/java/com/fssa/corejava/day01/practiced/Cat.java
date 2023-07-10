package com.fssa.corejava.day01.practiced;

public class Cat {
	
	private String color;
	private int age;
	
	
	
	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}

	public String speak() {
		return "Meow!";
	}



	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		cat1.setAge(4);
		cat1.setColor("white");
		
		cat2.setAge(3);
		cat2.setColor("Black");
		
		System.out.println("Cat-1:");
		System.out.println("Age: "+cat1.getAge());
		System.out.println("Color: "+cat1.getColor());
		System.out.println("Speaks: "+cat1.speak());
		
		System.out.println("Cat-2:");
		System.out.println("Age: "+cat2.getAge());
		System.out.println("Color: "+cat2.getColor());
		System.out.println("Speaks: "+cat2.speak());
		
	}

}
