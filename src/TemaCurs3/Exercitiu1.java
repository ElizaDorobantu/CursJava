package TemaCurs3;

import java.util.Scanner;

public class Exercitiu1 {
	public int numar;
	
	public static void main(String[] args) { 
		
	Exercitiu1 obj = new Exercitiu1();
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Ce varsta ai? ");
	obj.numar=scan.nextInt();
	scan.close();
	
	if (obj.numar <18){
		System.out.println("Esti minor");
	}
	else if ((obj.numar>=18)&&(obj.numar<=65)) {
		System.out.println("Esti adult");
		}
	else  {
			System.out.println("Esti batran");
		}
	}
}

