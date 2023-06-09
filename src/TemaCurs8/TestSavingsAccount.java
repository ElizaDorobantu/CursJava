package TemaCurs8;

import java.util.Scanner;

import curs8.InvalidAgeException;

public class TestSavingsAccount {

	public static double suma;
	
	public static void main(String[] args) {
		Customer cust = new Customer("Eliza","Adresa","Email");
		
		SavingsAccount sacc = new SavingsAccount(1234, 200, cust);
		
		System.out.println("Hi " + cust.getName());
		System.out.println("Please enter the amount to withdraw: ");
		Scanner scan = new Scanner (System.in);
		suma = scan.nextDouble();
		scan.close();
		
		try {
			sacc.withdraw(suma);
		} catch(InsufficientFundsException e) {
			e.printStackTrace();
		}
		
		

	}

}
