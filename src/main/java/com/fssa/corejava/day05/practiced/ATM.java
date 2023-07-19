package com.fssa.corejava.day05.practiced;

public interface ATM {
	boolean deposit(Account account , double amount);
	boolean withdraw(Account account , double amount) throws Exception;
	double getBalance();
}
