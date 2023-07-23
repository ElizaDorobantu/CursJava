package TemaCurs14;

/*
 * Scriem un program care calculeaza suma pe diagonala din urmatoarea
matrice
 31 21 3
 41 50 6
 70 89 9
 * 
 */
public class Exercitiul3 {

	public static void main(String[] args) {
		
		int[][] matrix = {{31,21,3},{41,50,6},{70,89,9}};
		int i=0;
		int sum=0;
		for (int[] row: matrix) {	
			for (int col:row)
			{
				if (i<row.length) {
				System.out.println(matrix[i][i]);
				sum+=matrix[i][i];
				}
			
				i++;
			}
		}
		System.out.println("Suma elementelor de pe diagonala principala: "+sum);
	}
}

