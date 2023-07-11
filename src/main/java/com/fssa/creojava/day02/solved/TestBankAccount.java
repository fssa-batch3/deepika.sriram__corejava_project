package com.fssa.creojava.day02.solved;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		
		acc.setAccNo("A101");
		acc.setName("Vaishnavi");
		acc.setBankBalance(1000.00);
		
		System.out.println(acc.getAccNo());
		System.out.println(acc.getName());
		System.out.println(acc.getBankBalance());
	}

}
