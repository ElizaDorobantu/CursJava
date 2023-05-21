package TemaCurs4;

import java.util.Scanner;

/*Scriem un program care intreaba utilizatorul un punctaj.
 Daca utilizatorul introduce o valoare mai mare sau egala cu 90 ii
atribuim FB
 Daca utilizatorul introduce o valoare mai mare sau egala cu 80 ii
atribuim B
 Daca utilizatorul introduce o valoare mai mica decat 80 ii atribuim S
 Daca a luat calificativ FB printam : “Ai primit : FoarteBine”
 Daca a luat calificativ B printam : “Ai primit : Bine”
 Daca a luat calificativ S printam : “Ai primit : Suficient”
*/

public class Exercitiul3 {

	public static void main(String[] args) {
		int punctaj;
		Scanner scan = new Scanner( System.in);
		System.out.println("Ce punctaj ai obtinut?");
		punctaj = scan.nextInt();
		scan.close();
		String calificativ = (punctaj>=90)?"FB":(punctaj>=80)?"B":"S";
		String mesaj=(calificativ.equals("FB"))?"Ai primit : FoarteBine":(calificativ.equals("B"))?"Ai primit : Bine":"Ai primit : Suficient";
		System.out.println(mesaj);
	}

}
