package curs5;

import java.util.Scanner;

/*
 * Facem un program care calculeaza salariul pe o saptamana
 * intrebam utilizatorul cate ore a lucrat
 * calculam doar dc a lucrat maxim 40 de ore sau minim 1 ora
 * daca introduce un numar invalid de ore il rugam sa introduca din nou
 * salariul = nrOreLucrate * 20;
 * 
*/

public class WageCalculator {

	public static void main(String[] args) {
		System.out.println("Te rog introdu nr de ore lucrate: ");
		Scanner scan = new Scanner(System.in);
		int nrOre = scan.nextInt();
		while (nrOre < 1 || nrOre > 40) {
			System.out.println("Nr ore invalid, te rog introdu un nr intre 1 si 40");
			System.out.println("Te rog introdu nr de ore lucrate: ");
			nrOre=scan.nextInt();
		}
		
		System.out.println("Salariul tau este "+ nrOre*20);
		scan.close();
	}

}
