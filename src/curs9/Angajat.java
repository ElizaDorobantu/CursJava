package curs9;

public interface Angajat {  //interfata e o clasa abstracta ce contine doar metode abstracte
	
	//interfectele nu se mostenesc
	//ele se implementeaza

	public void setName(String name);
	public String getName();
	
	public void setEmail(String email);
	public String getEmail();
	
	//public void testCeva(); //daca o definesc ulterior implementarii claselor ce
	//implementeaza interfata trebuie sa modific toate clasele si sa implementez noua metoda
	
	default void printDepartament() {
		System.out.println("QA"); //folosind default e singura posibilitate prin care putem adauga o 
		// functionalitate fara sa trebuiasca modificate clasele
	}
}
