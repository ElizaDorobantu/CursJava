package TemaCurs6;

import java.util.Scanner;

/*
 * Scriem un program care simuleaza un program de acordat bonusuri.
 Programul primeste input de la utilizator :
 Anul de vechime in firma
 Valoarea vanzarilor efectuate
 Luna in care a efectuat vanzarile
 Daca are un an vechime atunci primeste un bonus de 100
 Daca are 2 ani vechime atunci primeste un bonus de 200
 Daca are 3 ani vechime si valoarea vanzarilor este mai mica sau egala cu
5000 atunci primeste bonus 600
 Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si
vanzarile au fost efectuate in oricare din lunile 1-6 primeste bonus 800
 Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si
vanzarile au fost efectuate in oricare din lunile 7-11 primeste bonus 1000
 Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si
vanzarile au fost efectuate in luna 12 primeste bonus 900 si mesajul : “In
decembrie se vand singure!”
 Daca are 3 ani si valoarea vanzarilor este mai mare decat 10000 primeste
bonus 1200
 * 
 */
public class Exercitiul1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Cati ani vechime are in firma?");
		int aniVechime = scan.nextInt();
		int bonus = 0;
		switch (aniVechime) {
		case 1:
			bonus = 100;
			break;
		case 2:
			bonus = 200;
			break;
		case 3:
			System.out.println("Ce valoare totala au vanzarile efectuate?");
			float valoareVanzari = scan.nextFloat();
			if (valoareVanzari<= 5000) {
				bonus = 600;
			}
			else if (valoareVanzari <= 10000) {
				System.out.println("In ce luna au fost efectuate vanzarile?");
				int luna=scan.nextInt();
				switch (luna) {
				case 1:
				case 2: 
				case 3:
				case 4:
				case 5:
				case 6: 
					bonus = 800;
					break;
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
					bonus = 1000;
					break;
				case 12:
					bonus = 900;
					System.out.println("In decembrie se vand singure!");
					break;
				default: 
					System.out.println("Introdu o luna valida!");					
			   }
				
		}
			else {
				bonus = 1200;
			}
	}
	System.out.println("Valoare bonusului este " + bonus);
	scan.close();
}

}