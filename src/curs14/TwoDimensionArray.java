package curs14;

import java.util.Arrays;

public class TwoDimensionArray {

	public static void main(String[] args) {
		//int[] array = {1, 2, 3, 4};
		//array[2]  //--> = 3; index based
		
		int[][] array = {{1, 2}, {3, 4}};
		// int [2][4]
		/*			col0	col1
		 * row 0	1		2
		 * row 1	3		4
		 * 
		 */
		
		System.out.println(array[0][1]);
		for (int i=0; i<2; i++) {
			for (int j=0; j<2; j++) {
				System.out.print(array[i][j] + " ");
			}
		}
		System.out.println();
		
		//Object [][] --> String row, int col sau boolean
		//T[][]
		//Object[][] array = {{"String",true},{22.0,"altString"}} 
		// se declara Object[][] si el ne permite sa punem tipuri diferite de date
		//asa e el implementat
		
		System.out.println("---------For each -----------");
		//int[][] array = {{1, 2}, {3, 4}};
		for (int[] row : array) {
			System.out.println("Row: "+Arrays.toString(row));
			for(int col : row) {
				System.out.println("Col: "+col);
			}
		}
		System.out.println("----------------");
		String[][] textArray = new String[2][4];
		//String[][] textArray = {{null, null, null, null}, {null, null, null, null}}
		//prima dimensiune index 			0						1
		//a doua dimensiune index  0	  1     2     3       0     1     2     3
		textArray[0][0]="rosu";
		//String[][] textArray = {{rosu, null, null, null}, {null, null, null, null}}
		textArray[1][3]="alb";
		System.out.println(textArray.length);//-->numarul de randuri
		System.out.println(textArray[0].length);//-->numarul de coloane
		
		for (String[] row : textArray) {
			System.out.println(Arrays.toString(row));
			for(String element : row) {
				System.out.println(element);
			}
		}
		
		//System.out.println(array.length); //cate elemente am in array. Nu indexul. Numara normal, nu de la 0
		
	//	String [][] textArray = new String [4][3];
		//System.out.println(textArray.length);//-->numarul de randuri
		//System.out.println(textArray[0].length);//-->numarul de coloane
	}

}
