package TemaCurs7;

public class VerificareExercitiul2 {

	
	public static void main(String[] args) {
		Qualification obj = new Qualification("Java", 3, "Afternoon");
		if (obj.verify())
		{
			System.out.println("You are qualified to teach at this school!");
		}
		else {
			System.out.println("You are not qualified!");
		}
	}

}
