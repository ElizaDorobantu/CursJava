package curs7;

public class TestMostenire {

	public static void main(String[] args) {
		TesterAutomat obj = new TesterAutomat();
		obj.setProgrammingLanguage("Java"); // Clasa testerAutomat();
		obj.setDepartament("Automation"); // Clasa Tester();
		obj.setSeniority("Junior");// Clasa Tester();
		obj.setEmail("oana@oana.ro");// Clasa Angajat();
		obj.setNume("Oana");// Clasa Angajat();
		
		System.out.println(obj.getNume());
		System.out.println(obj.getProgrammingLanguage());
		System.out.println(obj.getDepartament());
		System.out.println(obj.getSeniority());
		System.out.println(obj.getEmail());
		
	}

}
