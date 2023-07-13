package com.fssa.corejava.day04.solved;


class Account4 {

	private String accNo;

	private String name;

	private double balance;

	// Default Constructor
	public Account4() {

	}

	// Creating a Constructor which accepts all the attributes: Constructor
	// Overloading
	public Account4(String accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
    public String toString() {
        return "Account [accNo=" + accNo + ", name=" + name + ", balance="  + balance + "]";
    }

}
public class WithToString {
	public static void main(String[] args) {
		Account4 acc = new Account4();
		acc.setAccNo("A001");
		acc.setName("Deepika");
		acc.setBalance(1000);
		
		System.out.println(acc.toString());
	}
}
