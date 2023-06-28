package TemaCurs10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercitiul1 {

	/*
	 * Scriem un program care reprezinta un catalog.
 Contine Numele si Notele unor elevi (un nume, o nota de fiecare J)
 Intrebam elevul cum il cheama si ce nota a luat.
 Daca elevul nu se regaseste in catalogul existent il adaugam cu tot cu nota
si printam “Nu aveai nota, ti-am trecut acum!”
 Daca elevul se regaseste si nota este mai mica decat nota existenta in
catalog, printam “Nu ai nevoie de alta nota”
 Daca elevul se regasete si noua nota este mai mare decat nota din catalog,
facem update catalogului cu noua nota.
 La final indiferent de situatie printam catalogul.
	 */
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Cati elevi sunt in clasa?");
		int numarElevi = scan.nextInt();
		int i=0;
		while (i<numarElevi)  {
			
		System.out.println("Cum te numesti?");
		String nume=scan.next();
		
		System.out.println("Ce nota ai luat?");
		int nota=scan.nextInt();

		
		if (!map.containsKey(nume)) {
			map.put(nume, nota);
			System.out.println("Nu aveai nota, ti-am trecut acum!");
			i++;
		}
		else {
			if (nota<=map.get(nume)) {
				System.out.println("Nu ai nevoie de alta nota");
			}
			else {
				map.remove(nume);
				map.put(nume,nota);
				System.out.println("Am modificat nota din catalog cu cea noua!");
			}
		}
		
		}
		System.out.println(map);
	}

}
