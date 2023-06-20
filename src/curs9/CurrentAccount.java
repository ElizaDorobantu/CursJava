package curs9;

import TemaCurs8.InsufficientFundsException;

public class CurrentAccount implements Account{

	public double balance;
	
	@Override
	public void deposit(double amount) throws InvalidAmountException{
		if (amount <= 0) {
			throw new InvalidAmountException(amount + "  is not valid!");
		}
		
		balance = balance + amount;
		checkBalance();
		//System.out.println("Current balance is: " + balance);	
	}

	@Override
	public void withdraw(double amount) throws InsuficientFunds{
		if (amount > balance) {
			throw new InsuficientFunds ("You don't have sufficient funds!");
		}
		
		balance = balance - amount;
		checkBalance();
		//System.out.println("Current balance is: " + balance);
		
	}

	@Override
	public void checkBalance() {
		System.out.println("Your current balance is: " + balance);
		
	}

}
