package com.fssa.corejava.day05.practiced;

public class App {
	public static void main(String[] args) {
		Department dept1 = new Department("CSE", 123);
		Student stud1 = new Student("Deepika", 007, dept1);
		System.out.println(stud1.toString());
	}
}
