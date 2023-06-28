package TemaCurs11;

import java.util.Arrays;
import java.util.Comparator;

/*
 * Considerand urmatoarele array-uri :
 String[] textArray = {"Alba", "Iasi", "Bacau", "Constanta"};
 Integer[] intArray = {100, 500, 300, 400, 200};
 Character[] charArray = {'a', 'b', 'd', 'c’};

 Vom face o singura metoda care ordoneaza aray-ul de tip String
alfabetic, array-ul de tip Integer crescator, si array-ul de tip char tot
alfabetic.

 Solutia o ganditi strict pe aceste array-uri de mai sus, nu daca
adaugam sau le modificam (ca sa nu complicam lucrurile J)
 */

public class Exercitiul2 {

	public static void main(String[] args) {
		String[] textArray = {"Alba", "Iasi", "Bacau", "Constanta"};
		Integer[] intArray = {100, 500, 300, 400, 200};
		Character[] charArray = {'a', 'b', 'd', 'c'};		
		
		//ordonareLista(textArray);
		//ordonareLista(intArray);
		//ordonareLista(charArray);
		
		ordonareListaVersiunea2(textArray);
		ordonareListaVersiunea2(intArray);
		ordonareListaVersiunea2(charArray);
	}
	
	/*public static <E extends Comparable<E>> void ordonareLista(E[] obj) {
		E temp;
		for (int i=0; i< obj.length;i++) {
			for(int j=0;j<obj.length-1;j++) {
				if(obj[j].compareTo(obj[j+1])>0) {
					temp=obj[j];
					obj[j]=obj[j+1];
					obj[j+1]=temp;
				}
			}
		}
			
		for (E element: obj) {
			System.out.print(element+ " ");
		}
		System.out.println();
	}*/
	
	public static <T> void ordonareListaVersiunea2(T[] obj) {
		Arrays.sort(obj);
		System.out.println(Arrays.toString(obj));
	}

}
