package curs14_package1;

public class ProtectedAccessMofidier {

	/*
	 * Protected
	 * Scopul lui este in acelasi pachet si sub-clase din pachete diferite
	 * Clasele nu pot fi declarate ca protected
	 * 
	 * Aceeasi clasa: yes
	 * Alta clasa in acelasi pachet: yes
	 * Sub-clasa(clasa copil) in acelasi pachet: yes
	 * Sub-clasa in alt pachet: yes
	 * Alta clasa in alt pachet: no
	 */
	
	String mesaj2 = "Default";
	protected String mesaj = "Protected Access";
	
	protected void printMesaj() {
		System.out.println(mesaj);
	}
	
	public static void main(String[] args) {
		ProtectedAccessMofidier obj = new ProtectedAccessMofidier();
		obj.printMesaj();

	}

}
