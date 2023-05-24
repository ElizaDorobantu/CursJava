package TemaCurs5;
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

	public static void main(String[] args) {
		int cateNr=9;
		int nr1=0;
		int nr2=1;
		int nrIntermediar;
		System.out.println("Seria Fibonacci pentru "+cateNr+" numere: "+nr1);
		for (int i=0;i<cateNr-1;i++) {			
			nrIntermediar=nr1+nr2;
			nr1=nr2;
			nr2=nrIntermediar;
			System.out.println(nr1);
		}		

	}

}
