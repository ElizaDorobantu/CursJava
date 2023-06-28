package TemaCurs11;

import java.util.Scanner;

public class VerificarePropertiesFile {

	public static void main(String[] args) {
		
		PropertiesFileProcessor obj = new PropertiesFileProcessor();
		
		obj.writeFileProperties();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ce leguma vrei sa cumperi?");
		
		String leguma = scan.next();
			 
		while (obj.readPropertiesFile(leguma) == null) {
		 System.out.println("Nu vindem aceasta leguma");
		 System.out.println("Alege alta leguma");
		 leguma=scan.next();
		}
		System.out.println("Leguma aleasa de tine are " + obj.readPropertiesFile(leguma)+" calorii");
		scan.close();
	}
	

}
