package curs5;

import java.util.Scanner;

/*Facem un program care ii cere userului numere incontinuu
 * le inmulteste cu 10 pana cand userul introduce 0
 * daca a introdus 0 facem exit din loop * 
 */

public class ForVsWhile {

	public static void main(String[] args) {
		rezolvareCuFor();
	//	rezolvareCuWhile();	

	}
	
	public static void rezolvareCuFor() {
		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		
		for (;;) {
			int nr = scan.nextInt();
			if(nr==0) {
				break;
			}
			System.out.println(nr*10);
			System.out.println("Please enter a number:");
			
		}
		scan.close();
		
	}
	
	public static void rezolvareCuWhile() {
		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		int nr=scan.nextInt();
		
		while (nr!=0) {
			System.out.println(nr*10);
			System.out.println("Please enter a number:");
			nr=scan.nextInt();
			
		}
		scan.close();
	}

}
