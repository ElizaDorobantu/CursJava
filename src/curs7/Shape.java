package curs7;

public class Shape {
	String nume = "nume generic";
	String culoare = "culoare generica";
	
	public Shape(String nume, String culoare) { //constructorul nu se mosteneste !!!
		this.nume=nume; //this referinta catre obiectul din clasa in care ma aflu
		this.culoare=culoare;
	}
}
