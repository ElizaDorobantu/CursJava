package TemaCurs7;

public class Qualification extends Teacher{
	
	public Qualification(String course, int experienceYears, String schedule) {
		super(course, experienceYears, schedule);
	}
	
	public boolean verify() {
		if (Course=="Java" && ExperienceYears==3 && Schedule=="Afternoon") {
			return true;
		}
		else {
			return false;
		}
	}
}
