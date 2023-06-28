package TemaCurs11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class PropertiesFileProcessor {
	
 public void writeFileProperties() {
	 
	Scanner scan = new Scanner(System.in);

	try (FileOutputStream outPutStream = new FileOutputStream("propertiesFile")) {
		Properties propFile = new Properties();
		propFile.setProperty("ceapa", "2");		
		propFile.setProperty("morcov", "3");
		propFile.setProperty("dovlecel", "5");
		propFile.setProperty("ardei", "7");
		propFile.setProperty("castravete", "9");
		propFile.store(outPutStream, "Am salvat fisierul");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
 }	
 
 public String readPropertiesFile(String key) {
	 
	 try (FileInputStream inputStream = new FileInputStream("propertiesFile")) {
		 Properties propFile = new Properties();
		 propFile.load(inputStream);
		 return propFile.getProperty(key);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	 
 }
}
