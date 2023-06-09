package TemaCurs7;

import java.util.Scanner;

public class Exercitiul1 {
/*Scriem un program care inverseaza un Array.
 Avem o metoda care intreaba userul care este lungimea Array-ului.
 Avem o metoda care utilizeaza un For pentru a inversa Arrayul si alta metoda
care utilizeaza un while pentru a face acelasi lucru*/
	
public static int lungimeArray;
public static int[] array ; 
	
public void introducerelungimeArray() {
	System.out.println("Cate elemente trebuie sa aiba array-ul?");
	Scanner scan = new Scanner (System.in);
	lungimeArray = scan.nextInt();
	scan.close();
}

public  void introducereElementeArray() {
	Scanner scan = new Scanner(System.in);
	for (int i=0;i<lungimeArray;i++) {
		System.out.println("Introdu elementul " + i +":" );
		if(scan.hasNextInt()) {
			array[i]=scan.nextInt();
		}
	}
	scan.close();
	
	/*Scanner scan = new Scanner (System.in);
	int i=0;
	while (i<lungimeArray) {
		System.out.println("Introdu elementul " + i +":" );
		if(scan.hasNextInt()) {
		array[i]=scan.nextInt();
		}
		i++;
	}
	scan.close();*/
}

public void afisareArrayCuFor() {
	System.out.print("Array reversed: ");
	for (int i=lungimeArray-1;i>=0;i--) {
		System.out.print(array[i]+" ");
	}
}

public void afisareArrayCuWhile() {
	System.out.print("Array reversed: ");
	int i=lungimeArray-1;
	while (i>=0) {
		System.out.print(array[i]+" ");
		i--;
	}
}

public static void main(String[] args) {
	Exercitiul1 obj = new Exercitiul1();
	obj.introducerelungimeArray();
	
	System.out.println("Array-ul are "+ lungimeArray+ " elemente ");
	
	array = new int [lungimeArray];
	
	obj.introducereElementeArray();
	
	
	obj.afisareArrayCuFor();
	System.out.println();
	obj.afisareArrayCuWhile();
	}

}
