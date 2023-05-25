package curs5;

import java.util.Scanner;

public class PasswordValidated {
/*
 * Facem un program care valideaza o parola pe baza unor reguli:
 * 
 * Reguli:
 * 1. parola trebuie sa fie de minim 10 caractere
 * 2. parola trebuie sa contina un upper case
 * 3. parola nu trebuie sa fie la fel ca username
 * 
 * Intrebam userul un username si o parola
 * il informam regulile parolei
 * 
 * Daca parola este valida, atunci printam "Parola valida!"
 * daca parola este invalida il informam care reguli nu au fost respectate si
 * il tinem in bucla pana introduce o parola valida
 */
	
	String username;
	//String password;
	static boolean valid;
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		PasswordValidated obj = new PasswordValidated();
		obj.printPasswordRules();
		obj.getUsername();
		do { 
			obj.checkPasswordRules(obj.getPassword());
		}while(!valid);
		System.out.println("Parola este valida!");
		/*```PasswordValidator obj = new PasswordValidator();
		obj.getUsername();
		do {
			obj.printPasswordRules();
			obj.getPassword();
		}while (!obj.checkPasswordRules());```*/
	}
	
	public void getUsername() {
		System.out.println("Te rog introdu username ");
		username=scan.next();
	}
	
	public String getPassword() {
		System.out.println("Te rog introdu parola ");
		return scan.next();
		 
	}
	
	public void printPasswordRules() {
		System.out.println("Reguli parola: ");
		System.out.println("1. Parola trebuie sa fie de minim 10 caractere");
		System.out.println("2. Parola trebuie sa contina un upper case");
		System.out.println("3. Parola nu trebuie sa fie la fel ca username");
	}

	public void checkPasswordRules( String password) {
		valid=true;
		if (password.length()<10) {
			System.out.println( "Parola trebuie sa fie de minim 10 caractere");
			valid = false;
		}
		/* password = "Admin"
		 * password.equals(password.lowerCase())
		 */
		if (password.equals(password.toLowerCase())) {
			System.out.println("Parola trebuie sa contina un upper case");
			valid = false;
		}
		if (password.equals(username)) {
			System.out.println("Parola nu trebuie sa fie la fel ca username");
			valid = false;
		}
	}
}
