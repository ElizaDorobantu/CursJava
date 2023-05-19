package TemaCurs3;

import java.util.Scanner;

public class Exercitiu2 {
	public float punctaj;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ce punctaj ai obtinut la test? ");
		
		Exercitiu2 obj=new Exercitiu2();
		obj.punctaj=scan.nextFloat();
		scan.close();
		
		if ((obj.punctaj>=0)&&(obj.punctaj<65)) {
			System.out.println("Ai picat. Mai incearca");
		}
		else  {
			System.out.println("Felicitari. Ai trecut");
		}
	}
}
