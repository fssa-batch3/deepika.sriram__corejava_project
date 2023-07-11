package com.fssa.creojava.day02.practiced;

public class App {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setId(12);
		user1.setName("Deepika");
		user1.setEmailId("deepika@gmail.com");
		user1.setPassword("asdf***1234");
		
		System.out.println(user1.getId());
		System.out.println(user1.getName());
		System.out.println(user1.getEmailId());
		System.out.println(user1.getPassword());
		
		
		
		Logger.debug(12);
		Logger.debug("Exception");
		Logger.error("ArrayIndexOutOfBoundException at main:java:14");
		Logger.info("Java compiler");
	}

}
