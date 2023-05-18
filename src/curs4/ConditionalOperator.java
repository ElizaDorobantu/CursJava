package curs4;
/* Program care citeste de la tastatura 2 numere si verifica urmatoarele:
 * daca fiecare numar este pozitiv
 * daca ambele numere sunt pozitive
 * care dintre cele 2 este cel mai mic (verificam daca sunt egale)
 * Printam:
 * Ex: Num1 este pozitiv
 * Numerele sunt pozitive
 * 
 * Implementare cu if - else
 * Implementare cu ternary (conditional) operator
 * 
 */

import java.util.Scanner;

public class ConditionalOperator {
	
	public static void main(String[] args) {
		int num1;
		int num2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu primul numar: ");
		num1=scan.nextInt();
		System.out.println("Te rog introdu primul numar: ");
		num2=scan.nextInt();
		
		if(num1>0) {
			System.out.println("num1 este pozitiv");
		}
		else {
			System.out.println("num1 este negativ");
		}
		if(num2>0) {
			System.out.println("num2 este pozitiv");
		}
		else {
			System.out.println("num2 este negativ");
		}		
		if (num1>0 && num2>0) {
			System.out.println("numerele sunt pozitive");
		}
		else {
			System.out.println("cel putin un numar este negativ");
		}
		
		if(num1>num2) {
			System.out.println("num1 este mai mare");
		}
		else if (num2>num1) {
			System.out.println("num2 este mai mare");
		}
		else {
			System.out.println("sunt egale");
		}
		
		System.out.println("--------------");
		
		//result = conditie ? expresie(true):expresie2(false)
		
		String y= (num1>0)?"num1 este pozitiv":"num1 este negativ";
		System.out.println(y);
		
		y= (num2>0)?"num2 este pozitiv":"num2 este negativ";
		System.out.println(y);
		
		y= (num1>0 &&num2>0)?"numerele sunt pozitive":"cel putin un numar e negativ";
		System.out.println(y);
		
		y= (num1>num2)?"num1 este mai mare":(num2>num1)?"num2 e mai mare":"sunt egale";
		System.out.println(y);
	}

}
