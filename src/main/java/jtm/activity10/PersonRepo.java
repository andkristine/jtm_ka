package jtm.activity10;

//import java.net.URI;
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
	Person person = new Person();

	public PersonRepo() {
		init();
	}

	public void init() {

		ObjectMapper mapper = new ObjectMapper();
		String str = "";
		try {

			linesInList = Files.readAllLines(Paths.get("/home/student/Desktop/JTM_KA/src/main/resources/data.json"));
			str = String.join("\n", linesInList);
			Person[] personArray = mapper.readValue(str, Person[].class);
			personList = Arrays.asList(personArray);

			System.out.println(linesInList);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Person oldestPerson() {
		
		for (int i = 0; i < personList.size(); i++) { // ka paradit, kurs pec kartas ir cilveks listaa,
														//lidzigi, ka to vajadzetu izdarit arraja?
		}
			
			if () {
				
				personlist[i];
				
		}
		
		
		
		
		// Find oldest person in personList field and return it
		return null;
	}

	public Person youngestPerson() {
		// Find youngest person in personList field and return it
		return null;
	}

	public String largestPopulation() {

		// variable, kas storo valstis?

		for (int i = 0; i < linesInList.size(); i++) {
			// pievienot jaunu elementu listā
			boolean countryInList = false;
			int indexOfTheCountry = 0;
			if (!person.getCountry().equals(person.getCountry())) {
						// vai 	boolean countryInList = false; nav tas pats, kas 
						// !person.getCountry().equals(person.getCountry())
				indexOfTheCountry = +1;
			} else {

			}

		}

		return null;
	}

	public static void main(String[] args) {
		PersonRepo personRepo = new PersonRepo();

	}

}

/*
 * 
 * Hint: ObjectMapper mapper = new ObjectMapper(); Person[] personArray =
 * mapper.readValue(data, Person[].class); List<Person> personList =
 * /////redaValue sagaida, ka tas bus strings, kura viss sarakst ir ieksa
 * Arrays.asList(personArray);
 */
