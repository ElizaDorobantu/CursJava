package TemaCurs7;

public class Qualification extends Teacher{
	
	public Qualification(String course, int experienceYears, String schedule) {
		super(course, experienceYears, schedule);
	}
	
	public void verify() {
		if (Course=="Java" && ExperienceYears==3 && Schedule=="Afternoon") {
			System.out.println("You are qualified to teach at this school!");
		}
		else {
			System.out.println("You are not qualified!");
		}
	}
}
