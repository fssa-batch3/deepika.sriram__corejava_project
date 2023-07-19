package com.fssa.corejava.day05.practiced;

public class AxisATM extends Account implements ATM{
	@Override
	public boolean deposit(Account account, double amount) {
		account.balance += amount;
		System.out.println("Your money has been deposited");
		return true;
		
	}
	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		if(account.balance < 5000) {
			throw new RuntimeException("Cannot withdraw money");
		}
		else {
			account.balance -= amount+5;
		}
		return true;
	}
	@Override
	public double getBalance() {
		return 0;
		
	}
}