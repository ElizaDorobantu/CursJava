package curs5;

import java.util.Scanner;

/*
 * Facem un joc de zaruri unde avem urmatoarele reguli:
 * 1. daca userul da in total 2, 6, 12 --> Pierde jocul
 * 2. daca userul da in total 7, 11 --> Castiga jocul
 * 3. daca userul da in total 3, 10 --> repeta automat aruncarea
 * 4. daca userul da oricare alta varianta decat cele de mai sus, il
 * intrebam daca vrea sa mai dea o data
 * raspunsul trebuie sa fie un boolean: true sau false
 * 
 */


public class DiceGame {

	public static void main(String[] args) {
		boolean continuaJocul=true;
		Scanner scan = new Scanner(System.in);
		while(continuaJocul) {
		int dice1 = (int) (Math.random()*6+1);
		int dice2 = (int) (Math.random()*6+1);
		int total = dice1+dice2;
		System.out.println("Ai dat " + total);
		
		if(total == 2 || total == 6 || total == 12) {
			System.out.println("Ai pierdut jocul");
			continuaJocul=false;
		}
		else if (total==7 || total==11) {
			System.out.println("Ai castigat jocul");
			break;
		}
		else if (total==3|| total==10) {
			System.out.println("Automat mai dai o data!");
		}
		
		System.out.println("Doresti sa mai dai o data?");
		
		continuaJocul=scan.nextBoolean();
		
		}
		scan.close();
		System.out.println("Game over!");
	}

}
