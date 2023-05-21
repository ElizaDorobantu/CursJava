package TemaCurs4;

import java.util.Scanner;

/*Scriem un program care intreaba utilizatorul 10 numere sub urmatoarea
forma:
 Please enter number 1:
 Please enter number 2:
 ---etc
 Dupa ce utilizatorul a introdus cele zece numere calculam suma lor si o
printam sub urmatoarea forma :
 The sum of the numbers is:
 Note:
 Folosim instructiunea FOR
 Inputul userului il putem citi in for
 Calculul sumei poate fi facuta cu un operator +=
*/

public class Exercitiul4 {

	public static void main(String[] args) {
		int suma=0;
		Scanner scan = new Scanner(System.in);
		for (int i=1;i<11;i++) {
			System.out.println("Please enter number "+ i);
			suma+=scan.nextInt();
		}
		scan.close();
		System.out.println("Suma numerelor este " + suma);

	}

}
