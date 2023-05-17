package TemaCurs3;

import java.util.Scanner;

public class Exercitiu3 {
	public int ziSaptamana;
	
	public static void main(String[] args) {
		Exercitiu3 obj = new Exercitiu3();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ce zi e astazi?");
		obj.ziSaptamana=scan.nextInt();
		scan.close();
		
		if (obj.ziSaptamana==0) {
			System.out.println("Te rog sa introduci un numar mai mare ca 0");
		}
		else if (obj.ziSaptamana==1) {
			System.out.println("Astazi este luni");
		}
		else if (obj.ziSaptamana==2) {
			System.out.println("Astazi este marti");
		}
		else if (obj.ziSaptamana==3) {
			System.out.println("Astazi este miercuri");
		}
		else if (obj.ziSaptamana==4) {
			System.out.println("Astazi este joi");
		}
		else if (obj.ziSaptamana==5) {
			System.out.println("Astazi este vineri");
		}
		else if (obj.ziSaptamana==6) {
			System.out.println("Astazi este sambata");
		}
		else if (obj.ziSaptamana==7) {
			System.out.println("Astazi este duminica");
		}
		else if (obj.ziSaptamana==1) {
			System.out.println("Astazi este luni");
		}
		else  {
			System.out.println("Saptamana are doar 7 zile. Te rog sa introduci un numar valid");
		}
	}
}
