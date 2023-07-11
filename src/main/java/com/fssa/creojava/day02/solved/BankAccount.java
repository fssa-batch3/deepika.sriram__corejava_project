package com.fssa.creojava.day02.solved;

public class BankAccount {
	private String accNo;
	private String name;
	private double bankBalance;
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String newAccNo) {
		this.accNo = newAccNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	
	public double getBankBalance() {
		return bankBalance;
	}
	public void setBankBalance(double newBankBalance) {
		this.bankBalance = newBankBalance;
	}
}
