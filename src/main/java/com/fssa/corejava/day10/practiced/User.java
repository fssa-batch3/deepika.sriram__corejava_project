package com.fssa.corejava.day10.practiced;

import java.util.*;

class UserAlreadyExistsException extends Exception {
	
	private static final long serialVersionUID = -8105491977357554060L;

	public UserAlreadyExistsException(String msg) {
		super(msg);
	}

	public UserAlreadyExistsException(Throwable te) {
		super(te);
	}

	public UserAlreadyExistsException(String msg, Throwable te) {
		super(msg, te);
	}
}

class UserModel {
	
	private int id;
	private String name;
	private String emailId;
	
	public UserModel(String name, String emailId, int id) {
		this.name = name;
		this.emailId = emailId;
		this.id = id;
	}
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", emailId=" + emailId + "]";
	}


}

class UserValidator {
	static ArrayList<UserModel> arr = new ArrayList<UserModel>();
	public static boolean registerUser(UserModel user) throws UserAlreadyExistsException {
		if (user == null) {
			throw new UserAlreadyExistsException("User Object Cannot be Null");
		}
		
		for (UserModel element : arr) {
			if (element.getEmailId() == user.getEmailId()) {
				throw new UserAlreadyExistsException("User already added");
			}
		}
		
		arr.add(user);
		System.out.println("User added: " + user.toString());
		return true;
	}
}

public class User{
	
	public static void main(String[] args) {
		try {
			UserModel user1 = new UserModel("Deepika", "deepika@gmail.com", 1);
			UserModel user2 = new UserModel("Vaishnavi", "vaishnavi@gmail.com", 2);
			UserModel user3 = new UserModel("Deepika", "deepika@gmail.com", 1);
			UserModel user4 = new UserModel("Uthra", "uthra@gmail.com", 1);
			
			UserValidator.registerUser(user1); 
			UserValidator.registerUser(user2); 
			UserValidator.registerUser(user3); 
			UserValidator.registerUser(user4);
		} catch (UserAlreadyExistsException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}