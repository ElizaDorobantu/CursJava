package curs12;

public class TestTextFileProcessor {

	public static void main(String[] args) {

		TextFileProcessor txtFile =  new TextFileProcessor();
		txtFile.writeTxt("Textul scris in fisier din Java!\n");
		txtFile.readTxt();
		txtFile.updateTxtFile("Alt text in fisier");
		txtFile.readTxt();

	}

}