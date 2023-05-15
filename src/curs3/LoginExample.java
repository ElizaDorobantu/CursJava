package curs3;

import java.util.Scanner;

/*Facem un program care citeste de la tastatura un user si o parola si le verifica 
 * daca sunt la fel ca urmatoarele:
 * String "TestUser" -> username
 * int 1234 -> parola
 * Daca sunt la fel printeaza: "Login successful"
 * Daca nu sunt la fel printeaza: Username or password is incorect"
 */

public class LoginExample {

	public String username;
	public int password;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the username : ");
		username=scan.next();
		System.out.println("Please enter the password : ");
		password = scan.nextInt();
		scan.close();		
	}
	
	public void checkCredentials() {
		//pentru String tot timpul folosim equals la comparare niciodata ==
		//equals verifica valoarea 
		//== verifica locatia in memorie
		
		// && -> and operator
		// || -> or operator
		
		if (username.equals("TestUser") && password==1234) { //la String tot timpul folosim equals niciodata ==
			System.out.println("Login successful!");
		}
		else {
			System.out.println("Username or password is incorect");
		}
	}
	
	
	
}
