package com.fssa.corejava.day03.practiced;

public class User {
	String name;
	String password;
	String email;
	
	public User() {
		
	}
	
	public User(String name , String password , String email) {
		this.name = name;
		this.password = password;
		this.email = email;
		
	}
	
	
	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User("Deepika" , "asdf***1234" , "deepika.sriram@fssa.freshworks.com");
		
		System.out.println(user2.name+"\n"+user2.password+"\n"+user2.email);
	}
}
