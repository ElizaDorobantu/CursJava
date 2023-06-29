package TemaCurs13;

import java.util.ArrayList;
import java.util.List;

/*
 * Avem urmatorul string : “Lorem ipsum dolor sit amet, consectetur
adipiscing elit. Aliquam consectetur odio ac quam commodo, eu
eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus,
vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius
malesuada. Nulla neque lacus, euismod quis erat nec, convallis
vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat.
Nulla elementum urna in dolor viverra, in efficitur lectus mattis.”
 
 Vom face 4 metode :
 1. Prima metoda va verifica de catre ori apare cuvantul “Nulla” in
acest string si va printa numarul
 2. A doua metoda va imparti stringul in cate propozitii cuprinde si le
va printa fiecare pe randul ei in consola
 3. A treia metoda va folosi metoda deleteCharAt() din StringBuilder
pentru a sterge toate aparitiile literei ‘a’
 4. A patra metoda va folosi clasa StringBuilder pentru a inlocui toate
aparitiile literei ‘o’ cu caracterul ‘#’
 */

public class Exercitiul1 {

	public static void main(String[] args) {
		String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam consectetur odio ac quam commodo, eu eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus, vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius malesuada. Nulla neque lacus, euismod quis erat nec, convallis vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat. Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";
		aparitieText(text, "Nulla");
		impartirePropozitii(text, ".");
		stergereAparitii(text,'a');
		inlocuireCaracter(text,'o',"#");
		
	}
	
	public static void aparitieText(String text, String aparitie) {
		StringBuilder sb = new StringBuilder(text);
		int count=0;
		int index=0;
		do {
			index = sb.indexOf(aparitie,index);
			//System.out.println(index);
			if(index != -1) {
				index++;
				count++;
			}
		}while(index!=-1);
		
		System.out.println("------aparitieText----------");
		System.out.println("Cuvantul apare in string de " + count + " ori");
		System.out.println();
		
	}
	
	public static void impartirePropozitii(String text, String aparitie) {
		StringBuilder sb = new StringBuilder(text);
		int index1 = 0;
		int index2 = 0;
		List<String> list =  new ArrayList<>();
		
		do {
			index2 = sb.indexOf(aparitie,index2);
			//System.out.println(index2);
			if(index2 != -1) {
				list.add(sb.substring(index1,index2+1));
				index1=index2+2;
				index2++;
			}
		}while(index2!=-1);
		
		System.out.println("------impartirePropozitii----------");
		for (String element : list) {
			System.out.println(element);
		}
		System.out.println();
	}
	
	public static void stergereAparitii(String text, char litera) {
		StringBuilder sb = new StringBuilder(text);
		for(int i=0; i<sb.length();i++) {
			if(sb.charAt(i)==litera) {
			sb.deleteCharAt(i);}
			}
		System.out.println("------stergereAparitii----------");
		System.out.println(sb);
		System.out.println();
	}
	
	public static void inlocuireCaracter(String text, char caracterDeSters, String caracterNou) {
		StringBuilder sb = new StringBuilder(text);
		for(int i=0; i<sb.length();i++) {
			if(sb.charAt(i)==caracterDeSters) {
				sb.replace(i, i+1, caracterNou);
			}}
		System.out.println("------inlocuireCaracter----------");
		System.out.println(sb);
		System.out.println();
	}
}

