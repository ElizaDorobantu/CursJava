package TemaCurs13;

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
	}
	
	public static void aparitieText(String text, String aparitie) {
		StringBuilder sb = new StringBuilder(text);
		System.out.println(text.contains(aparitie));
	}
	
	public static void impartirePropozitii(String text) {
		StringBuilder sb = new StringBuilder(text);
		for(int i=0; i<sb.length();i++) {
			//if(Character.is {
				sb.insert(i, " ");
		}
	}
	/*
	public static void stergereAparitii(Sting text, char litera) {
		StringBuilder sb = new StringBuilder(text);
		for(int i=0; i<sb.length();i++) {
			if (sb.getChars(i, litera, null, i))
			sb.deleteCharAt(litera);
		System.out.println(sb);
	}*/
}

