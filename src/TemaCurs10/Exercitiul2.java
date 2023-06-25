package TemaCurs10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercitiul2 {
	/*
	 * Considerand cele doua ArrayList de mai jos :

Primul contine : Product1 ; Product2 ; Product3 ; Product4 ; Product5
Al doilea contine : Product1 ; Product2 ; Product6 ; Product4 ; Product8

Avem nevoie sa verificam daca produsele din primul arraylist se afla si in al
doilea arrayList
	Rezultatul verificarii ar trebui sa fie un output de tip yes/no
	
Ex din consola:
[Yes, Yes, No, Yes,No]
	 */
	
	public static void main(String[] args) {
		String produs1;
		
		List<String> list1 = new ArrayList<>(Arrays.asList("Product1", "Product2", "Product3", "Product4", "Product5"));
		List<String> list2 = new ArrayList<>(Arrays.asList("Product1", "Product2", "Product6", "Product4", "Product8"));
		int sizeList1 = list1.size();
		int sizeList2 = list2.size();
		
		List<String> listOutput =  new ArrayList<>();
		
		if (sizeList1 >= sizeList2) {		
			for (int j=0;j<sizeList2;j++) {
			if(list1.get(j)==list2.get(j)) {
				listOutput.add("Yes");
			}
			else {
				listOutput.add("No");
			}
		}}
		else {
			for (int i=0;i<sizeList1;i++) {
				if(list1.get(i)==list2.get(i)) {
					listOutput.add("Yes");
				}
				else {
					listOutput.add("No");
				}
			}
		}
		
			System.out.print(listOutput);

	}

}
