package TemaCurs8;

public class Account {
	
	private int accountNumber;
	public double balance;
	public Customer accountOwner;
	
	public Account(int accountNumber, double balance, Customer accountOwner) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountOwner = accountOwner;
	}
	
	public void withdraw(int suma) throws InsufficientFundsException {
		if (suma>0) {
			if (suma > balance) {		
			throw new InsufficientFundsException();
			}
			else 
			{
				balance=balance-suma;
			}
		}
		else {
				System.out.println("The amount you have entered must be greater than 0");
			}
		
	}
	
	
}
