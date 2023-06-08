package curs8;

public class TestWildAnimal {

	public static void main(String[] args) {
		
		WildAnimal animal = new WildAnimal();
		animal.makeSound();
		
		System.out.println("----------------------");
		
		Deer bambi = new Deer();
		bambi.makeSound();//metoda suprascrisa/override
		bambi.eatGrass();
		
		//WildAnimal bambi2 = new Deer();
		
		System.out.println("---------------");
		Lion simba = new Lion();
		simba.makeSound();//metoda suprascrisa
		simba.eatMeat();
		
		
		/*
		WildAnimal simba = new Lion();
		simba.makeSound();
		//simba.eatMeat();  --nu merge
		((Lion) simba).eatMeat();  //print cast merge
		
		simba = new Deer();*/
		simba.makeSound();
	}

}
