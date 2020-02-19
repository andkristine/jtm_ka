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

			// linesInList =
			// Files.readAllLines(Paths.get("/home/student/Desktop/JTM_KA/src/main/resources/data.json"));
			linesInList = Files
					.readAllLines(Paths.get("C:/Users/Kristine/Desktop/Sources/JTM_KA/src/main/resources/data.json"));
			str = String.join("\n", linesInList);
			Person[] personArray = mapper.readValue(str, Person[].class);
			personList = Arrays.asList(personArray);

			System.out.println(linesInList);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Person oldestPerson() {

		Person oldestPerson = personList.get(0);

		for (int i = 0; i < personList.size(); i++) {

			// nevar but i, kas ir -1, indekss, kas -1
//			boolean wasChecked = false;
//			if (wasChecked == false) {
//				if (personList.get(0).getBirthDate().compareTo(personList.get(i).getBirthDate()) > 0) {
//					oldestPerson = personList.get(i);
//					wasChecked = true;
//				}
//
//			} else {
//				if (personList.get(i).getBirthDate().compareTo(personList.get(i - 1).getBirthDate()) < 0) {
//					oldestPerson = personList.get(i);
//				}
//			}
			boolean wasChecked = false;
			if (wasChecked == false) {
				if (personList.get(0).getBirthDate().after(personList.get(i).getBirthDate())) {
					oldestPerson = personList.get(i);
					wasChecked = true;
				}

			} else {
				if (personList.get(i).getBirthDate().after(personList.get(i - 1).getBirthDate())) {
					oldestPerson = personList.get(i);
				}
			}
		}
		return oldestPerson;
	}

	public Person youngestPerson() {
		Person youngestPerson = personList.get(0);
		
		for (int i = 0; i < personList.size(); i++) {

			// nevar but i, kas ir -1, indekss, kas -1
			boolean wasChecked = false;
			if (wasChecked == false) {
				if (personList.get(0).getBirthDate().compareTo(personList.get(i).getBirthDate()) < 0) {
					youngestPerson = personList.get(i);
					wasChecked = true;
				}

			} else {
				if (personList.get(i).getBirthDate().compareTo(personList.get(i - 1).getBirthDate()) < 0) {
					youngestPerson = personList.get(i);
					continue;
				}
			}

		}
		// Find youngest person in personList field and return it
		return youngestPerson;

	}

	public String largestPopulation() {

		for (int i = 0; i < linesInList.size(); i++) {
			// pievienot jaunu elementu listā

			if (!person.getCountry().equals(person.getCountry())) {

			} else {

			}

		}

		return null;
	}

	public static void main(String[] args) {
		PersonRepo personRepo = new PersonRepo();
		System.out.println(personRepo.oldestPerson().personToString());
		System.out.println(personRepo.youngestPerson().personToString());
	}

}

/*
 * 
 * Hint: ObjectMapper mapper = new ObjectMapper(); Person[] personArray =
 * mapper.readValue(data, Person[].class); List<Person> personList =
 * /////redaValue sagaida, ka tas bus strings, kura viss sarakst ir ieksa
 * Arrays.asList(personArray);
 */
