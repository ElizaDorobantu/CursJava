package curs8;

public class Deer extends WildAnimal{
	
	@Override //sau suprascrierea unei metode
	public void makeSound() {
		System.out.println("Meeee !");
	}
	
	public void eatGrass() {
		System.out.println("I eat grass and i like it!");
	}

}
