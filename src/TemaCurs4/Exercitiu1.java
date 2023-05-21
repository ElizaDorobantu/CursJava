package TemaCurs4;

import java.util.Scanner;

/*Scriem un program care aplica un discount unei facturi.
 Daca factura este mai mare decat 100 aplica un discount de 10%
 Daca factura este mai mica decat 100 aplica un discount de 5%
 Printam rezultatul*/

public class Exercitiu1 {

	public static void main(String[] args) {
		float factura;
		float valoareFinalaFactura;
		Scanner scan = new Scanner(System.in);
		System.out.println("Valoarea facturii este ");
		factura=scan.nextFloat();
		scan.close();
		valoareFinalaFactura= (factura>=100)?factura*90/100:factura*95/100;
		System.out.println("Valoarea finala a facturii este de "+valoareFinalaFactura+" lei");

	}

}
