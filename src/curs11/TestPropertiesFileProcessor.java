package curs11;

public class TestPropertiesFileProcessor {

	public static void main(String[] args) {

		PropertiesFileProcessor obj =  new PropertiesFileProcessor();
		obj.writePropertiesFile();
		obj.readPropertiesFile("user");
		obj.updatePropertiesFile("email", "nimic");
		obj.updatePropertiesFile("browser", "chrome");
		obj.deleteFromPropertiesFile("email");

		
	}

}