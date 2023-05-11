package curs2;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle obj= new Rectangle(3, 4);
		System.out.println(obj.calculateArea());
		int sum =20 + obj.calculateArea();
		System.out.println(sum);
	}

}
