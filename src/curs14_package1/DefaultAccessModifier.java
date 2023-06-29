package curs14_package1;

class DefaultAccessModifier {
	
	/*
	 * Default inseamna ca nu specificam niciun access modifier
	 * Scopul lui este limitat la pachetul in care se afla
	 * 
	 * Aceeasi clasa: yes
	 * Sub-clasa acelasi pachet: yes
	 * Alta clasa in acelasi pachet: yes
	 * 
	 * Sub-clasa in alt pachet: no
	 * Alta clasa in alt pachet: no
	 * 
	 */

	String mesaj = "Default modifier";
	
	void printMesaj() {
		System.out.println(mesaj);
	}
	
	public static void main(String[] args) {
		DefaultAccessModifier obj = new DefaultAccessModifier();
		obj.printMesaj();
	}

}
