package TemaCurs7;

import java.util.Scanner;

public class Exercitiul3 {

	/*Scriem un program care intreaba utilizatorul 10 numere. Tine acele
	numere intr-un array si le printeaza doar pe cele care sunt pare.
 	Scriem rezolvarea folosind atat FOR cat si WHILE
	*/
	
	public static int [] array = new int[10];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu elementele array-ului");
		for (int i=0; i<10; i++) {
			System.out.println("Introdu elementul "+ i);
			array[i] = scan.nextInt();
		}
		scan.close();
		for (int i=0;i<10;i++) {
			if (array[i] % 2 == 0)
			System.out.print(array[i] + " ");
		}
		
			

	}

}
