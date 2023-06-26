package curs12;



	import java.io.*;
	import java.io.IOException;

	import org.json.simple.*;
	import org.json.simple.parser.JSONParser;

	public class JsonFileProcesor {

		@SuppressWarnings("unchecked")
		public void writeJsonFile() {
			
			JSONObject obj = new JSONObject();
			obj.put("name", "TestUser");
			obj.put("email", "email@testuser.com");
			
			JSONArray list = new JSONArray();
			list.add("Obiect1");
			list.add("Obiect2");
			list.add("Obiect3");
			list.add("Obiect4");
			list.add("Obiect5");
			
			obj.put("listaObiecte", list);
			
			try(FileWriter file =  new FileWriter("test.json")){
				
				file.write(obj.toJSONString());
				
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
		public void readJson(String key) {
			try (FileReader file = new FileReader("test.json")){
				JSONParser parse = new JSONParser();
				JSONObject jsonObj = (JSONObject)parse.parse(file);
				
				//System.out.println(jsonObj);
				System.out.println("Key : " + jsonObj.get(key));
				
				JSONArray lista = (JSONArray) jsonObj.get("listaObiecte");
				//System.out.println("Obj lista "+lista.get(1));
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		public void updateJsonFile(String key, String value) {
			try(FileReader file = new FileReader("test.json")){
				JSONParser parser = new JSONParser();
				JSONObject jsonObj = (JSONObject)parser.parse(file);
				jsonObj.put(key,value);
				
				try(FileWriter fileOutput = new FileWriter("test.json")){
					fileOutput.write(jsonObj.toJSONString());
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public void deleteFromJson(String key) {
			try(FileReader file = new FileReader("test.json")){//incarc fisierul pt citire
				JSONParser parser = new JSONParser();//ajuta la parsarea,citirea fisierului
				JSONObject jsonObj = (JSONObject)parser.parse(file);//obiect caruia ii dau ce am parcurs
				jsonObj.remove(key);
				
				try {
					FileWriter fileOutput = new FileWriter("test.json");//pt salvarea modificarilor
					fileOutput.write(jsonObj.toJSONString());
					fileOutput.close();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				
			}catch(Exception e) { //pt a prinde exceptiile de la JSONParser, JSONObject
				e.printStackTrace();
			}
		}
	}

