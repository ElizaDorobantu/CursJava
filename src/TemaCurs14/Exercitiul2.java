package TemaCurs14;

import java.util.Arrays;

/*
 * Scriem un program care gaseste cel mai mare element din urmatorul Array
 int[][] matrix = {{1, 2, 3}, {4, 9, 6}, {7, 8, 5}};
 Avem o metoda care primeste ca parametru array-ul si returneaza cea mai
mare valoare din interior.
 * 
 */
public class Exercitiul2 {

	public static int calculeazaMaxim(int array[][]) {
		int max=array[0][0];
		for (int[] row : array) {			
			//System.out.println(Arrays.toString(row));
			for(int col : row) {
				System.out.println(col);
				if (col>max) {
					max=col;
				}
			}
			}
		System.out.println("-------------");
		return max;
}
		
	
	public static void main(String[] args) {
		int[][] matrix = {{1, 2, 3}, {4, 9, 6}, {7, 8, 5}};
		System.out.println("Elementele array-ului sunt:");
		System.out.println("Cel mai mare element din array este "+String.valueOf(calculeazaMaxim(matrix)));

	}

}
