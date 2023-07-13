package com.fssa.corejava.day02.misc;

public class Student {
	String name;
	int id;
	String email;
	public static String academy;
	
	static int count = 0;
	
	
	public String getName() {
		return name;
	}
	public void setName(String newname) {
		name = newname;
	}
	public int getId() {
		return id;
	}
	public void setId(int newid) {
		id = newid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String newemail) {
		email = newemail;
	}
	
	static {
		academy = "FSSA"; 		//static initialization block
	}
	
	
	public Student() {
		Student.count+=1;
	}
}
