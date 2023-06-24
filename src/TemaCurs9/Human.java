package TemaCurs9;

public class Human extends Primate implements BasicNeeds{
//Avem o clasa Human care mosteneste clasa Primate si
//implementeaza interfata BasicNeeds
	
	public String eat() {
		return "Omnivor";
	}
	
	public void sleep() {
		System.out.println("I need to sleep!");
	}
	
	
	@Override
    public  void walk() {
		System.out.println("can walk");
	}
	
	@Override
	public void run(){
		System.out.println("can run");
	}
	
	@Override
	public void speak() {
		System.out.println("I can speak!");
	}
	
}
