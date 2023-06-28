package curs11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInArray {

	public static void main(String[] args) {

		Set<String> numeDuplicat = new HashSet<>();
		String[] names = {"Ion", "Maria","Oana", "Ion","Oana", "Ion", "Bogdan", "Ion", "Maria", "Oana"};
		
		for(int i=0; i<names.length; i++) {
			
			for(int j = names.length-1; j>i; j--) {
				
				if(names[i].equals(names[j]) ) {
					System.out.println("Nume duplicat :" + names[i]);
					numeDuplicat.add(names[i]);
				}
			}
			
		}
		
		System.out.println("---------------------------");
		for(String nume : numeDuplicat) {
			System.out.println("Nume duplicat :" + nume);

		}
		
		System.out.println("---------------------------");

		Set<String> numeDuplicat2 = new HashSet<>(Arrays.asList(names));
		for(String nume : numeDuplicat2) {
			System.out.println("Nume duplicat2 :" + nume);

		}

		
		
		
	}

}