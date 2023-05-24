package TemaCurs5;

import java.util.Scanner;

/*Scriem un program care simuleaza un login.
 Programul primeste input de la utilizator un user si o parola.
 Are trei incercari de logare
 Atata timp cat incearca de trei ori si credentialele sunt gresite programul va
printa : “Maximum attempts reached. User blocked”
 Pentru fiecare incercare gresita programul printeaza : “Login Error”
 Daca credentialele sunt valide programmul printeaza : “Login Sucessful”
 Note:
 Userul este String si valoarea valida este: “TestUser”
 Parola este int si valoarea valida este :1234*/

public class Exercitiul1 {

	String username;
	int password;
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int i=0;
		Exercitiul1 obj= new Exercitiul1();
		obj.getUser();
		obj.getPassword();
		while (!obj.username.equals("TestUser") && obj.password!=1234 && i<2 ){
			
			System.out.println("Login Error");
			obj.getUser();
			obj.getPassword();
			i++;
		}
		if (obj.username.equals("TestUser") && obj.password==1234) {
			System.out.println("Login Sucessful");
		}
		else if (i==2)
		{
			System.out.println("Maximum attempts reached. User blocked");
		}
		//nu stiu unde sa inchid scan-ul
	}
	
	public void getUser() {
		System.out.println("Please enter a user");
		username = scan.next();
		
	}
	
	public void getPassword() {
		System.out.println("Please enter a password");
		password = scan.nextInt();
		
	}

}
