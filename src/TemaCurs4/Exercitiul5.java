package TemaCurs4;
/*Scriem un program care intreaba utilizatorul un numar si printeaza
tabla inmultirii acelui numar de la 1 la 10
 Exemplu :
Please enter a number:
 3
 Printam :
 3 * 1 = 3
 3 * 2 = 6
 3 * 3 = 9
 3 * 4 = 12
 3 * 5 = 15
 ----etc
 Nota : Folosim instructiunea for.
*/

import java.util.Scanner;

public class Exercitiul5 {

	public static void main(String[] args) {
		int numar;
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a number:");
		numar = scan.nextInt();
		for(int i=1;i<11;i++) {
			System.out.println(numar + " * "+i+" = "+numar*i);
		}
		scan.close();
	}

}
