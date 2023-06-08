package curs8;

public class OverloadExample {

	public static void multiply(int num1, int num2) {
		System.out.println(num1*num2);
	}
	
	public static void multiply(double num1, double num2) {
		System.out.println(num1*num2);
	}
	
	public static void main(String[] args) {
		multiply(3,2);
		multiply(3,4.8);  // method overload
		System.out.println("123");
		System.out.println(123);
		System.out.println('1');
		System.out.println(123.5);
	}
 // supraincarcarea pastreaza functionalitatea dar cu data type uri diferite
}
