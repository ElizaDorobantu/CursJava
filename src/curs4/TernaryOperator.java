package curs4;

public class TernaryOperator {

	public static void main(String[] args) {
		int a=130;
		int b=60;
		
		int x;
		
		x=a>b?a:b;
		if (a>b) {
			x=a;
		}
		else
		{x=b;
	}
		System.out.println("x= " +x);
		
		int num1=5;
		int num2=10;
		int num3=8;
		
		int y=(num1>num2)? num1 : num2;
		
		y=(num1>num2)?num1:(num2<num3?num2:num3);
		
		if(num1>num2) {
			y=num1;
		}
		else if (num2<num3) {
			y=num2;
		}
		else {
			y=num3;
		}
		
		System.out.println("y= "+y);

}
}