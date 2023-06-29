package curs14;

public class TransformToString {

	public static void main(String[] args) {
		char ch = 'a';
		String chString = Character.toString(ch); //metoda 1
		String chString2 = String.valueOf(ch); //metoda 2
		
		int nr = 20;
		String intString = Integer.toString(nr);
		String intString2 = String.valueOf(nr);
		
		boolean bol = true;
		String bolString = Boolean.toString(bol);
		String bolString2 = String.valueOf(bol);

		String str = null; //"test";
		System.out.println(str.toString()); //daca obiectul este null , arunc NullPointer Exception
		System.out.println(str.valueOf(str)); // daca obiectul este null , printeaza null
		
		//diferenta e cand am null
	}

}
