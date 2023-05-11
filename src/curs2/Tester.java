package curs2;

//UpperCamelCase - NumeleClaseiMele
//lowerCamelCase - numeleMetodeiMele

//numele_metodei_mele - sneak case in Phyton

public class Tester {
	//variabile de instanta
	private String nume;
	public int ratePerHour;
	
	//construnctor
	public Tester() {
		
	}
	
public Tester(String nume, int ratePerHour) {
	setNume(nume);
	this.ratePerHour=ratePerHour;
	}
	
	//metode
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	/*
	 * Tester tester1=new Tester();
		tester1.setNume("Oana"); --> inlocuieste tester1.nume = "Oana";
		this.nume=nume;  primul nume e variabila la nivel de clasa, al doilea nume e cel dat ca parametru in metoda
		
		public void setNume(String text) {
			this.nume = text;
		}
	*
	*/
	
}
