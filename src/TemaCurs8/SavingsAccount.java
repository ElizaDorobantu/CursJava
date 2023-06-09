package TemaCurs8;

import curs8.InvalidAgeException;

public class SavingsAccount extends Account{

	public SavingsAccount (int accountNumber, double balance, Customer accountOwner) {
		super(accountNumber, balance, accountOwner);
		}
	
	public void withdraw(double suma) throws InsufficientFundsException {
		
		if (balance >= suma) {			
			System.out.println("Please pick your money!");
			balance=balance-suma;
			System.out.println("Your new balance is : " + balance);
			System.out.println("Thank you for using our ATM");
		}

		else {
			System.out.println("The amount you have entered is greater than the available balance :" + balance);
			System.out.println("Thank you for using our ATM");
			throw new InsufficientFundsException();
			
	}
}
}
