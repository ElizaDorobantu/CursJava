package curs8;

public class AgeVerifier {

	public void checkAge(int age) throws InvalidAgeException {
		if (age < 18 ) {
			//throw new ArithmeticException();  --doar pt exemplu
			throw new InvalidAgeException("De ce nu esti major?");
		}
		else {
			System.out.println("You are allowed to proceed!");
		}
	}
}
