package jtm.activity03;

public class RandomPerson {

	// TODO Create _private_ structure of random person to store values:
	// name as String,
	// age as int,
	// weight as float,
	// isFemale as boolean;
	// smile as char
	// HINT: use Alt+Shift+A to switch to Block selection (multi-line cursor)
	// to edit list of all properties at once
	// START	
	private String name = "ff";
	private int age = 43;
	private float weight= 45;
	private boolean isFemale = true;
	private char smile = 's';
	// END
	
	
	
	// TODO Generate getters and setters for all private fields of the class
	// START
	public String getName () {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight () {
		return weight;
	}
	public void setWeight (float weight){
		this.weight = weight;
	}
	public boolean isFemale () {
		return isFemale;
	}
	
	public void isFemale(boolean isFemale){
		this.isFemale = isFemale;
	}
	
	// END
	
	
	
	

}
