package curs4;

public class Palindrom {
	//radar citit de la dreapta la stanga, respectiv de la stanga la dreapta e acelasi cuvant

	public static void main(String[] args) {
		checkPalindrom("radar");

	}
	
	public static void checkPalindrom(String cuvant) {
		/* cuvantIntors = ""
		 * cuvant = radar
		 * 
		 * cuvantIntors=cuvantIntors + "r"
		 * cuvantIntors=cuvantIntors + "r"
		 * 
		 */
		String cuvantIntors= "";
		for (int i=cuvant.length()-1;i>=0;i--) {
			cuvantIntors=cuvantIntors +cuvant.charAt(i);
		}
		
		String result = cuvantIntors.equals(cuvant)?"Este palindrom":"Nu este palindrom";
		System.out.println(result);
	}

}
