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
			// 1. Read file data.json from resources folder into String
			// 2. Use ObjectMapper to convert String to List of Persons and
			// store in personList field
			// Hint: Correct way how to use ObjectMapper to convert String to
			// List belowObjectMapper mapper = new ObjectMapper();

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
			// ar true/false japajauta, vai jau eksiste si valsts
			if (person.getCountry().equals(person.getCountry())) {

			} else {

			}

		}

		return null;
	}

	public static void main(String[] args) {
		PersonRepo personRepo = new PersonRepo();
		// personRepo.toString()
		// System.out.println();

	}

}

/*
 * 
 * Hint: ObjectMapper mapper = new ObjectMapper(); Person[] personArray =
 * mapper.readValue(data, Person[].class); List<Person> personList =
 * /////redaValue sagaida, ka tas bus strings, kura viss sarakst ir ieksa
 * Arrays.asList(personArray);
 */
