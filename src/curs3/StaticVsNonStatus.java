package curs3;

public class StaticVsNonStatus {
	//variabile statice
	public static String nume;
	public static String departament="QA";
	
	//variabile non statice(variabile de instanta)
	public String prenume="Ion";
	
	public static void main(String[] args) {
		/*System.out.println(nume);
		//System.out.println()StaticVsNonStatus.nume;
		StaticVsNonStatus obj=new StaticVsNonStatus();
		System.out.println(obj.prenume);*/
		
		StaticVsNonStatus person = new StaticVsNonStatus();
		person.nume = "Oana";
		
		System.out.println(person.nume);
		System.out.println(person.departament);
		System.out.println("-------------------------");

		StaticVsNonStatus person2 = new StaticVsNonStatus();
		person2.nume = "Mario";
		
		System.out.println(person2.nume);
		System.out.println(person2.departament);
		System.out.println("-------------------------");
		
		StaticVsNonStatus person3 = new StaticVsNonStatus();
		person3.nume = "Trei";
		departament="DEV";
		
		System.out.println(person3.nume);
		System.out.println(person3.departament);
		System.out.println("-------------------------");
		
		System.out.println(person.nume+person.departament);
		System.out.println(person2.nume+person2.departament);
		System.out.println(person3.nume+person3.departament);
	}

}
