package TemaCurs9;

public class Monkey extends Primate implements BasicNeeds{
//Avem o clasa Monkey care mosteneste clasa Primate si
//implementeaza interfata BasicNeeds
	
	public String eat(){
		return "mostly erbivore ";
	}
	
	public void sleep(){
		System.out.println("I need to sleep!");
	}
	
		
	
	@Override
    public void walk() {
		System.out.println("can walk");
	}
	
	@Override
	public void run(){
		System.out.println("can run");
	}
	
	@Override
	public void speak() {
		System.out.println("can not speak");
	}
}
