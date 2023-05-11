package curs2;

public class WageCalculator {
	
	public int workedHours =40;

	public static void main(String[] args) {
		
		/*System.out.println("Print de test");
		WageCalculator obj = new WageCalculator();
		obj.printGreetings();//CTRL+spatiu autocorrect*/
		
		Tester tester1=new Tester();
		//tester1.nume = "Oana";
		tester1.ratePerHour=25;
		tester1.setNume("Oana");
		
		Tester tester2 = new Tester();
		tester2.ratePerHour = 30;
		tester2.setNume("Maria");
		
		Tester tester3 = new Tester("Ion",15);
		
		Developer dev1= new Developer();
		dev1.setNume("Cristi");
		dev1.ratePerHour=35;
		
		System.out.println("Rate per hour for " + tester1.getNume() + " is " + tester1.ratePerHour );
		System.out.println("Rate per hour for " + tester2.getNume() + " is " + tester2.ratePerHour );
		System.out.println("Rate per hour for " + tester3.getNume() + " is " + tester3.ratePerHour );

		WageCalculator obj = new WageCalculator();
		System.out.println("Salariu lui "+tester1.getNume()+ " este "+obj.calculatesSalary(tester1.ratePerHour));
		System.out.println("Salariu lui "+tester3.getNume()+" este "+obj.calculatesSalary(tester3.ratePerHour));
		System.out.println("Salariu lui "+dev1.getNume()+" este "+obj.calculatesSalary(dev1.ratePerHour));

	}

	public int calculatesSalary(int plataPeOra) {
		return workedHours * plataPeOra;
	}
	
	public void printGreetings() {
		System.out.println("Buna dimineata");//sysout - CTRL + spatiu Eclipse si 
	}
	
}
