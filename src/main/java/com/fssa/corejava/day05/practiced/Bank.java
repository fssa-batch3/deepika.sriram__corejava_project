package com.fssa.corejava.day05.practiced;

public class Bank {
	public static void main(String[] args) throws Exception {
		
		Account account1  = new Account();
		account1.setBalance(9000);
		
		AxisATM atm1 = new AxisATM();
		atm1.deposit(account1, 500);
		atm1.withdraw(account1, 1000);
		
		IciciATM atm2 = new IciciATM();
		atm2.deposit(account1, 200);
		atm2.withdraw(account1, 1000);
	}
}
