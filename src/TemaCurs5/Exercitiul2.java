package TemaCurs5;

import java.util.Scanner;

/*Scriem o secventa de numere Fibonacci folosind o structura for si
inca o data folosind o structura while
 Un numar fibonacci :
https://ro.wikipedia.org/wiki/Num%C4%83r_Fibonacci
 Exemplu output :

Note :
Avem o variabila pentru cate numere vrem sa calculam care are val 9
Avem doua numere cu care incepem 0 si 1
Seria se calculeaza asa (un numar este seria numerelor precedente):*/

public class Exercitiul2 {
	int cateNr=9;
	int nr1=0;
	int nr2=1;
	int nrIntermediar;
	
	public static void main(String[] args) {	
	Exercitiul2 obj = new Exercitiul2();
	obj.cateNr=9;
	obj.nr1=0;
	obj.nr2=1;
	System.out.println("Ce metoda doresti sa alegi? Daca doresti cu for introdu 1, daca doresti cu while introdu 2");
	Scanner scan = new Scanner(System.in);
	int metoda = scan.nextInt();
	if(metoda==1) {
	obj.forFibonacci();}
	else if (metoda == 2) {
	obj.whileFibonacci();
	}
}
	
	public void forFibonacci() {
		System.out.println("Seria Fibonacci pentru "+cateNr+" numere: "+nr1);
		for (int i=0;i<cateNr-1;i++) {			
			nrIntermediar=nr1+nr2;
			nr1=nr2;
			nr2=nrIntermediar;
			System.out.println(nr1);
			}
	}	
		
	public void whileFibonacci() {
		int i=0;
		System.out.println();
		System.out.println("Seria Fibonacci pentru "+cateNr+" numere: "+nr1);
		while (i<cateNr-1) {
			nrIntermediar=nr1+nr2;
			nr1=nr2;
			nr2=nrIntermediar;
			System.out.println(nr1);
			i++;	
		}


	}

}
