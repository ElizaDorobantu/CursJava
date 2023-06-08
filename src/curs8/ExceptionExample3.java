package curs8;

public class ExceptionExample3 {

	public static void main(String[] args) {
		try {
			String nume = null ;//"Ion";
			System.out.println(nume.length());
		}catch(Exception e) {
			System.out.println("Exception occured");
			System.out.println(3/0);
		}
		finally{ // se executa mereu, indiferent dc intra sau nu pe catch
			System.out.println("Finally block of code");
		}
		System.out.println("Seteaza parametrul inapoi");
	}

}
