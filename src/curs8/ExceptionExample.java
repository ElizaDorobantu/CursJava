package curs8;

public class ExceptionExample {

	public static void main(String[] args) {
		String[] week = {"L", "M", "Mi", "J", "V", "S", "D"};
		//index			  0	   1    2     3    4    5    6    7    8  ....
		
		try {
			System.out.println(week[8]);
		}
		catch(ArrayIndexOutOfBoundsException obj) {
			System.out.println(obj.getMessage());
		}
		
		
		for (String day:week) {
			System.out.print(day+" ");
		}

	}

}
