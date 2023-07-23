package TemaCurs14;

import java.util.Arrays;

/*
 * Scriem un program care transforma urmatorul Array intr-un String.
 Integer[] numbers = {1, 2, null, 4, 5, 6, 7, null, 9};
 Array-ul nu il modificam. Il folosim asa cum este
 * 
 */

public class Exercitiul1 {

	public static void main(String[] args) {
		Integer[] numbers = {1, 2, null, 4, 5, 6, 7, null, 9};
		int i=0;
		int nrElements=numbers.length;
		String valoareString=String.valueOf(numbers[i]);
		while (i < nrElements-1) {
			i++;
			valoareString = valoareString + " " + numbers[i];						
			}
		System.out.println(valoareString);
			
		}

}
