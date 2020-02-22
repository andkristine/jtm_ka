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
			// linesInList = Files
			// .readAllLines(Paths.get("C:/Users/Kristine/Desktop/Sources/JTM_KA/src/main/resources/data.json"));
			str = String.join("\n", linesInList);
			Person[] personArray = mapper.readValue(str, Person[].class);
			personList = Arrays.asList(personArray);

			// System.out.println(linesInList);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Person oldestPerson() {

		Person oldestPerson = personList.get(0);

		for (int i = 0; i < personList.size(); i++) {

			if (oldestPerson.getBirthDate().compareTo(personList.get(i).getBirthDate()) > 0) {
				oldestPerson = personList.get(i);

			}
		}

		return oldestPerson;
	}

	public Person youngestPerson() {
		Person youngestPerson = personList.get(0);

		for (int i = 0; i < personList.size(); i++) {

			if (youngestPerson.getBirthDate().compareTo(personList.get(i).getBirthDate()) < 0) {
				youngestPerson = personList.get(i);

			}
		}

		return youngestPerson;

	}

	public String largestPopulation() {

		HashMap<String, Integer> bodyCount = new HashMap<>();

		for (int i = 0; i < personList.size(); i++) {
			if (bodyCount.containsKey(personList.get(i).getCountry())) {

				bodyCount.put(personList.get(i).getCountry(), bodyCount.get(personList.get(i).getCountry()) + 1);

			} else {

				bodyCount.put(personList.get(i).getCountry(), 1);

			}

		}
		System.out.println(bodyCount.toString());

		String largestCountry = "";
		int people = 0;

		for (String s : bodyCount.keySet()) { // keySet ir key ///
												// bodyCount.get(s) ir value

			if (bodyCount.get(s) > people) {
				largestCountry = s;
				people = bodyCount.get(s);
			}

		}

		return largestCountry;
	}

	public static void main(String[] args) {
		PersonRepo personRepo = new PersonRepo();
		System.out.println(personRepo.oldestPerson().personToString());
		System.out.println(personRepo.youngestPerson().personToString());
		System.out.println(personRepo.largestPopulation());
	}

}
