package jtm.activity10;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
TODO Necessary imports commented
 */
//import com.fasterxml.jackson.databind.ObjectMapper;

//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PersonRepo {

	private List<Person> personList;
	static List<String> linesInList;
	//Person person;
	
	//Path pathToFile = Paths.get("/home/student/Desktop/JTM_KA/src/main/resources/data.json");
	
	public PersonRepo() {
		init();
	}

	public void init() {


		try {
			// 1. Read file data.json from resources folder into String
			// 2. Use ObjectMapper to convert String to List of Persons and
			// store in personList field
			// Hint: Correct way how to use ObjectMapper to convert String to
			// List below
			this.linesInList = Files.readAllLines(Paths.get("/home/student/Desktop/JTM_KA/src/main/resources/data.json"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		ObjectMapper mapper = new ObjectMapper(); 
		
		Person[] personArray = mapper.readValue(data, Person[].class);
		List<Person> personList = Arrays.asList(personArray);
		
	    String s = String.join("\n", linesInList); 
	}

	public Person oldestPerson() {
		// Find oldest person in personList field and return it
		return null;
	}

	public Person youngestPerson() {
		// Find youngest person in personList field and return it
		return null;
	}

	public String largestPopulation() {
		// Find country with largest population and return it's name
		return null;
	}
	
	public static void main (String[] args){
		System.out.println();
		
	}
	
	
	
	
	

}

/*
 * 
 * Hint: ObjectMapper mapper = new ObjectMapper(); Person[] personArray =
 * mapper.readValue(data, Person[].class); List<Person> personList = /////redaValue sagaida, ka tas bus strings, kura viss sarakst ir ieksa
 * Arrays.asList(personArray);
 */



	//String s = "";
//    for (String str : lines) {res += str + "\n";}
//String s = String.join("\n", linesInList); pirmais - kas ir japiekabina klat, otrs ir tas, no kurienes velamies nolasit
























