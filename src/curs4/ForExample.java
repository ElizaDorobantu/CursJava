package curs4;

public class ForExample {

	public static void main(String[] args) {
		for (int i=0;i<10;i++) {
			if (i==5) {
				// break; //intrerupe executia buclei => 0,1,2,3,4
				continue; //face skip => 0,1,2,3,4,6,7,8,9
			}
			System.out.println(i);
		}

	}

}
