package TemaCurs9;

public interface BasicNeeds {
	
	//Avem o interfata care se cheama BasicNeeds si are 3 metode:
	//eat, sleep, drink (eat are return type String si sleep si drink au void)
	
	public String eat();
	public void sleep();
	default public void drink() {}

}
