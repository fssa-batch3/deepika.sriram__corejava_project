package com.fssa.creojava.day03.solved;

public class TestAccount {

	public static void main(String[] args) {
		Account acc1 = new Account("A001" , "Deepika" , 1000);
		System.out.println(acc1.accNo +" - "+acc1.name + " - "+acc1.bankBalance);
		
		
		Account acct2 = new Account("A102","Uthra", 1000);
        System.out.println(acct2.accNo + " - " + acct2.name + " - " + acct2.bankBalance);
        
        
        Account2 acct1 = new Account2();
		acct1.setAccNo("A101");
		acct1.setName("Naresh");
		acct1.setBalance(1000);

		System.out.println(acct1.getAccNo() + "-" + acct1.getName() + "-"
				+ acct1.getBalance());
		
		// Create Account with Overloaded constructor accepting parameters
		Account2 acct3 = new Account2("A102", "Arun", 1000);
		System.out.println(acct3.getAccNo() + "-" + acct3.getName() + "-"
				+ acct3.getBalance());

	}

}
