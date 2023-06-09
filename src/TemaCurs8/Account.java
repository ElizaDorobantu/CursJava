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
		if (suma > balance) {		
			throw new InsufficientFundsException();
			}
		else {
			balance=suma-balance;
		}
		
	}
	
	
}
